package com.mycompany.phonedesignmethordlab;

public class Landline extends Motherboard {

    boolean storageFull;

    public Landline() {
        boolean powered = false;
        homeSecurityControlBehaviour = new NoSecurity();
        callBehaviour = new Call();
        cameraBehaviour = new Nocam();
        textBehaviour = new noText();

    }

    void powerDevice() {
        System.out.println("Devied powered");
    }

 
  }

