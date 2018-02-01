/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HostData;

/**
 * Typ wyliczeniowy wykorzystywane w klasie FeedBack, ma informować o poleceniu
 * z serwera (wyłącz się, wyślij jeszcze raz, wykonaj polecenie).
 * @author zadruzyn
 */
public enum Reply
{  
      CLOSE, RESEND, EXEC;
}
