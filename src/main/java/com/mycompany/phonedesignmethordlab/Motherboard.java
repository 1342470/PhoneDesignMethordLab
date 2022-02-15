package com.mycompany.phonedesignmethordlab;

public abstract class Motherboard {

    CallBehaviour callBehaviour;
    CameraBehaviour cameraBehaviour;
    TextBehaviour textBehaviour;
    HomeSecurityControlBehaviour homeSecurityControlBehaviour;

    public Motherboard() {
        boolean powered;
    }

    public void setcallBehaviour(CallBehaviour callBhav) {
        callBehaviour = callBhav;
    }

    public void setCameraBehaviour(CameraBehaviour camBehaviour) {
        cameraBehaviour = camBehaviour;
    }

    public void setTextBehaviour(TextBehaviour textBhav) {
        textBehaviour = textBhav;
    }

    public void setHomeSecurityContorlBehaviour(HomeSecurityControlBehaviour secureBhav) {
        homeSecurityControlBehaviour = secureBhav;
    }

    public void call() {
        callBehaviour.Call();
    }

    public void useCamera() {
        cameraBehaviour.takePhoto();
    }

    public void text() {
        textBehaviour.sendMessage();
    }

    public void useHomeSecurity() {
        homeSecurityControlBehaviour.viewSecurity();
    }

    abstract void powerDevice();
}
