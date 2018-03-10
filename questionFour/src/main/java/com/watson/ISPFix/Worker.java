package com.watson.ISPFix;

public class Worker implements WorkerInterface,Feedable {

    public void work() {

        System.out.println("Doing work");
    }

    public void eat() {

        System.out.println("Eating Lunch");
    }

}
