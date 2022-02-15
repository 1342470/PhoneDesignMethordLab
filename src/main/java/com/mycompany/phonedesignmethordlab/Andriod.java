package com.mycompany.phonedesignmethordlab;

public class Andriod extends Motherboard{
   boolean storageFull;
 public Andriod(){
   boolean powered = false;
   homeSecurityControlBehaviour = new Security();
   callBehaviour = new Call();
   cameraBehaviour = new Camear();
   textBehaviour = new SendMessage();
   
 }

 void powerDevice(){
    System.out.println("Device powered on welcome user: Please select from the following options; call,Home Security,Camera,Text");
 }
 
 void checkStorage(){
   if(storageFull == true){
     cameraBehaviour = new Nocam();
   }
 }
}