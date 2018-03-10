package com.watson.Inheritance_Polymorphism_Encapusulation;

public class Vehicle implements Transport{
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
        System.out.print("Vehicles are used from moving fro one place to another");
    }

    public void drive(){
        System.out.print("Driving a vehicle");
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
