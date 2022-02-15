package com.mycompany.phonedesignmethordlab;

public class Camear implements CameraBehaviour{
    int storage =10;
  public void takePhoto(){
    System.out.println("image saved");
    storage--;
   
  }

  public void deletePhoto(){
    System.out.println("photo deleted");
    storage++;
  }
}