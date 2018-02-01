/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HostData;

import java.io.Serializable;

/**
 * Klasa której obiekt jest wysyłany z serwera do klienta, z odpowienim żądaniem
 * nie ukończone
 * @author zadruzyn
 */
public class FeedBack implements Serializable
{
   private Reply r;
   private String exec;
   public FeedBack(Reply reply, String command){
      r = reply;
      exec = command;
   }
   
   public Reply getReply(){
      return this.r;
   }
   
   public String getCommand(){
      return this.exec;
   }
}

