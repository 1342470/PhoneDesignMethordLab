package com.mycompany.phonedesignmethordlab;

class Main {
  public static void main(String[] args) {
    Moblie myMoblie = new Moblie();
    Andriod myAndriod = new Andriod();
    Smartphone mySmartphone = new Smartphone();
    Landline myLandline = new Landline();
    
    myMoblie.call();
    myAndriod.call();
    mySmartphone.call();
    myLandline.call();
    
    myMoblie.text();
    myAndriod.text();
    mySmartphone.text();
    myLandline.text();

    myMoblie.useCamera();
    myAndriod.useCamera();
    mySmartphone.useCamera();
    myLandline.useCamera();
    
    myMoblie.useHomeSecurity();
    myAndriod.useHomeSecurity();
    mySmartphone.useHomeSecurity();
    myLandline.useHomeSecurity();
    
    
  }
}