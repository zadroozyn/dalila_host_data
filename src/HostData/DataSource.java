/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HostData;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * klasa abstrakcyjna która tworzące się przygotowuje dane do wysłania
 * wszystkie obliczenia w ten sposób są robione po stronie klienta a serwer 
 * dostaje gotowe dane.
 * Abstrakcyjna dlatego że część funkcjonalności jest oczywista i stała dla 
 * każdego systemu, natomiast tylk sposób zeniarania danych jest inny (dlatego
 * nie interfejs)
 * @author zadruzyn
 */
public abstract class DataSource implements Serializable
{
   /**
    * Konstruktor domyślny, ustala tylko OS
    */
   public DataSource()
   {
      this.osName = System.getProperty("os.name");
      this.osVer = System.getProperty("os.version");
      partitions = new ArrayList<>();
   }
   

   /**
    * Zwraca listę partycji
    *
    * @return the value of partitions
    */
   public ArrayList<Partition> getPartitions()
   {
      return partitions;
   }
   protected ArrayList<Partition> partitions;
   
   private String osName;
   
   private String osVer;
   


   /**
    * Zwraca liczbę partycji
    *
    * @return the value of part
    */
   public int getPart()
   {
      return partitions.size();
   }

   /**
    * Zwraca wersję OS
    *
    * @return the value of osVer
    */
   public String getOsVer()
   {
      return osVer;
   }

   /**
    * Zwraca nazwę OS
    *
    * @return the value of osName
    */
   public String getOsName()
   {
      return osName;
   }
   
   /**
    * Wywołanie polecenia systemowego
    * @param cmd komenda do wywołania
    * @return string z wynikiem polecenia
    * @throws IOException 
    */
   protected String exec(String cmd) throws IOException{
      String out = "";
      Scanner result = 
              new Scanner(Runtime.getRuntime().exec(cmd).getInputStream());
      while(result.hasNext()){
         out+=result.nextLine()+"\n";
      }
      
      return out;
   }

}
