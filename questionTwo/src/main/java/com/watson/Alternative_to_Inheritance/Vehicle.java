package com.watson.Alternative_to_Inheritance;

public class Vehicle {

    private int numOfSeats;
    private int numOfWheels;
    private String vehType;

    public Vehicle() {
    }

    public Vehicle(int numOfSeats, int numOfWheels, String vehType) {
        this.numOfSeats = numOfSeats;
        this.numOfWheels = numOfWheels;
        this.vehType = vehType;
    }

    public int getNumberOfSeats() {
        return numOfSeats;
    }

    public int getNumberOfWheels() {
        return numOfWheels;
    }

    public String getVehicleType() {
        return vehType;
    }
    public void move(){
        System.out.print("Vehicles are used for moving from one place to another.");
    }

    public void drive(){
        System.out.print("You are driving a vehicle.");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numOfSeats=" + numOfSeats +
                ", numOfWheels=" + numOfWheels +
                ", vehType='" + vehType + '\'' +
                '}';
    }
}
