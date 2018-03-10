package com.watson.ISPViolation;

public class Manager {

    WorkerInterface worker;

    public void setWorker(WorkerInterface worker)
    {
        this.worker = worker;
    }

    public void manage()
    {
        worker.work();
        worker.eat();
    }
}
