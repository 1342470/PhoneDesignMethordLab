package com.mycompany.phonedesignmethordlab;

public class Nocam implements CameraBehaviour{
  public void takePhoto(){
    System.out.println("this device cannot take pictures as it doesn't support this feature");
  }
}