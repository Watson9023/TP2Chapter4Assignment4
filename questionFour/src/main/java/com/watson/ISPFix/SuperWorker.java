package com.watson.ISPFix;

public class SuperWorker implements WorkableInterface, Feedable{

    public void eat() {

        System.out.println("SuperWorker: Eating Lunch");
    }

    public void work() {

        System.out.println("SuperWorker: Doing work");
    }


}
