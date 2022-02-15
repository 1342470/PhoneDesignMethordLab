package com.mycompany.phonedesignmethordlab;

public class Moblie extends Motherboard {

    boolean storageFull;

    public Moblie() {
        boolean powered = false;
        homeSecurityControlBehaviour = new NoSecurity();
        callBehaviour = new Call();
        cameraBehaviour = new Nocam();
        textBehaviour = new SendMessage();

    }

    void powerDevice() {
        System.out.println("Device powered on welcome user: Please select from the following options; call,Text");
    }

    void checkStorage() {
        if (storageFull == true) {
            cameraBehaviour = new Nocam();
        }
    }
}
