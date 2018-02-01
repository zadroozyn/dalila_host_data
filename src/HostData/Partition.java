/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HostData;

import java.io.Serializable;

/**
 * Reprezentuje partycję na dysku hosta
 * @author zadruzyn
 */
public class Partition implements Serializable
{ 
   private final String mountPoint;
   private final String label;
   private final long totalSpace;
   private final long usedSpace;
   private final long unUsedSpace;

   public Partition(String mountPoint, String label, long totalSpace, 
           long usedSpace, long unUsedSpace)
   {
      this.mountPoint = mountPoint;
      this.label = label;
      this.totalSpace = totalSpace;
      this.usedSpace = usedSpace;
      this.unUsedSpace = unUsedSpace;
   }

   public double freeSpacePrecent(){
      return ((double)usedSpace/(double)totalSpace)*100;
   }
   /**
    * Zwraca wolna przestrzeń na partycji
    *
    * @return the value of unUsedSpace
    */
   public long getUnUsedSpace()
   {
      return unUsedSpace;
   }
   /**
    * Zwraca zajętą przestrzeń na partycji
    *
    * @return the value of usedSpace
    */
   public long getUsedSpace()
   {
      return usedSpace;
   }
   /**
    * Zwraca pojemność partycji
    *
    * @return the value of totalSpace
    */
   public long getTotalSpace()
   {
      return totalSpace;
   }

   /**
    * Zwraca punkt montowania
    *
    * @return the value of mountPoint
    */
   public String getMountPoint()
   {
      return mountPoint;
   }

   /**
    * Zwraca etykietę partycji
    *
    * @return the value of label
    */
   public String getLabel()
   {
      return label;
   }

}
