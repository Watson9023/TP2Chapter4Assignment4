package com.watson.ISPFix;

public  class RunLspFix {

    public static void main(String[] args) {

            Manager manager = new Manager();
            WorkableInterface worker = new Worker();
            WorkableInterface superWorker = new SuperWorker();
            WorkableInterface robot = new Robot();
            manager.setWorker(superWorker);
            manager.manage();
            manager.setWorker(worker);
            manager.manage();
            manager.setWorker(robot);
            manager.manage();
        }

    }

