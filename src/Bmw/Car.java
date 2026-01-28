package Bmw;

public  class Car {
    private String name;
    private double maxSpeed;
    private int fuelCapacity;


    public void displayDetails(){
        System.out.println("the name of the car is "+name);
        System.out.println("the max speed of this car is :"+maxSpeed);
        System.out.println("the fuel capacity of this car is "+fuelCapacity);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}

