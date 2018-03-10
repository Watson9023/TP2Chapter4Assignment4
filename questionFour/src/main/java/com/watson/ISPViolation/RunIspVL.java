package com.watson.ISPViolation;

public class RunIspVL {

    public static void main(String[] args) {
        WorkerInterface worker = (WorkerInterface) new Worker();
        WorkerInterface superWorker = (WorkerInterface) new Worker();
        Manager manager = new Manager();
        manager.setWorker(worker);
        manager.manage();
        manager.setWorker(superWorker);
        manager.manage();
    }
}
