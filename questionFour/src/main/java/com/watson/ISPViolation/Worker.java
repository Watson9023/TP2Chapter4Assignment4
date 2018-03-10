package com.watson.ISPViolation;

public class Worker implements WorkerInterface
{
    public void work() {

        System.out.println("Worker: Doing work");
    }


    public void eat() {

        System.out.println("Worker: Eating food");
    }
}
