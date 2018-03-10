package com.watson.DipFix;

public class RunDip {

    public static void main(String[] args)
    {
        WorkerInterface worker = new Worker();
        WorkerInterface superWorker = new SuperWorker() {
            public void eat() {

            }
        };
        Manager manager = new Manager();
        manager.setWorker(worker);
        manager.manage();
        manager.setWorker(superWorker);
        manager.manage();
    }
}
