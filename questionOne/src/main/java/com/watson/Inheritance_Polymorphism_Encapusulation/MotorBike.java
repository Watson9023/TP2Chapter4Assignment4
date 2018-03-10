package com.watson.Inheritance_Polymorphism_Encapusulation;

public class MotorBike extends Vehicle{

    public MotorBike() {
    }

    public MotorBike(int numOfSeats, int numOfWheels, String vehType) {
        super(numOfSeats, numOfWheels, vehType);
    }

    @Override
    public int getNumberOfSeats() {
        return super.getNumberOfSeats();
    }

    @Override
    public int getNumberOfWheels() {
        return super.getNumberOfWheels();
    }

    @Override
    public String getVehicleType() {
        return super.getVehicleType();
    }

    @Override
    public void move() {
        System.out.print("Motor Bikes are a fast medium of transport.");
    }

    @Override
    public void drive() {
        System.out.print("You are driving a motor bike.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
