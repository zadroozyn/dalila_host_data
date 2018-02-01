/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HostData;

import java.io.IOException;
import java.util.Scanner;

/**
 * Klasa dzidzicząca po DataSource, wersja dla linux i mac os x
 * windowsa nie zdjążyłem zaimplementować
 * @author zadruzyn
 */
public class DataSourceLinux extends DataSource
{
   public DataSourceLinux() throws IOException{
      super();
      String df = this.exec("df");
      this.parseDisks(df);
   }
   
   /**
    * Parsowanie stringa otrzymanego z polecenia 'df' w linuxie i macu, wypełnia
    * ArrayList z partycjami
    * @param in string otrzymany z 'df'
    */
   private void parseDisks(String in){
      Scanner parse = new Scanner(in);
      while(parse.hasNext()){
         String[] line = parse.nextLine().trim().split("\\s++");
         if(!line[0].startsWith("/")) continue;
         
         Partition p = new Partition(line[0], line[5], Long.parseLong(line[1]),
            Long.parseLong(line[2]), Long.parseLong(line[line.length-1]));
          partitions.add(p);
      }
   }
   
}
