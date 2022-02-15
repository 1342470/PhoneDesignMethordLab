package com.mycompany.phonedesignmethordlab;

public class NoCall implements CallBehaviour{
  public void Call(){
    System.out.println("this device is unable to call as it doesn't support this feature");
  }
}