package com.cybertek.utilities;

public class BrowserUtils {


       public static void wait( int sec ){

           try {
               Thread.sleep(sec*1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }

