package com.mycompany.phonedesignmethordlab;

public class Security implements HomeSecurityControlBehaviour{
  public void viewSecurity(){
    System.out.println("this device cannot access security as it doesn't support this feature");
  }
}