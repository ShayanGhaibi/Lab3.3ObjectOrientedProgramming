package edu.sdccd.cisc191;

public class Vehicle {
    private final String manufacturerName;
    private final int milesOnVehicle;
    private int price;
    private int numberOfSeats;
    private Option[] options;

    //Vehicle vehicle = new Vehicle("GMC", 80000, 7995, 4, null);
    public Vehicle(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options) {
        this.manufacturerName = manufacturerName;
        this.milesOnVehicle = milesOnVehicle;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.options = options;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getMilesOnVehicle() {
        return  milesOnVehicle;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Option[] getOptions() {
        return options;
    }
}
