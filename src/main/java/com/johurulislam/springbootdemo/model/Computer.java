package com.johurulislam.springbootdemo.model;

public class Computer {
    private String brand;
    private String model;
    private Integer ram;
    private Integer storage;
    private Float cupClockSpeed;

    public Computer() {
    }

    public Computer(String brand, String model, Integer ram, Integer storage, Float cupClockSpeed) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.cupClockSpeed = cupClockSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public Float getCupClockSpeed() {
        return cupClockSpeed;
    }

    public void setCupClockSpeed(Float cupClockSpeed) {
        this.cupClockSpeed = cupClockSpeed;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", cupClockSpeed=" + cupClockSpeed +
                '}';
    }
}
