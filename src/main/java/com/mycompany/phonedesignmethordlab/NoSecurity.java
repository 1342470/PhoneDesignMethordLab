package com.mycompany.phonedesignmethordlab;

public class NoSecurity implements HomeSecurityControlBehaviour{
  public void viewSecurity(){
    System.out.println("this device cannot access security as it doesn't support this feature");
  }
}