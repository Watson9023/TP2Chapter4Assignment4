package com.watson.Alternative_to_Inheritance;

public class Car {

    private Vehicle car;
    private int doors;

    public Car() {
    }

    public Car(Vehicle car, int doors) {
        this.car = car;
        this.doors = doors;
    }

    public int getNumberOfDoors(){
        return doors;
    }
    public int getNumberOfSeats(){
        return 4;
    }
    public int getNumberOfWheels(){
        return 4;
    }
    public String getVehicleType(){
        return "Car";
    }
    public void move(){
        System.out.print("Cars are a good medium of transport.");
    }

    public void drive(){
        System.out.print("You are driving a car.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "car=" + car +
                ", doors=" + doors +
                '}';
    }
}
