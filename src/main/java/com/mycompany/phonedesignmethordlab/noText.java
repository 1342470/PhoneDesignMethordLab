package com.mycompany.phonedesignmethordlab;


public class noText implements TextBehaviour{
  public void sendMessage(){
    System.out.println("this device is unable to text as it doesn't support this feature");
  }
}