package com.watson.ISPFix;

public class Manager {

    WorkableInterface worker;

    public void setWorker(WorkableInterface worker)
    {
        this.worker = worker;
    }

    public void manage()
    {
        worker.work();
    }
}
