package com.example.ismael.materialdesign.domain;

/**
 * Created by Ismael on 11/05/15.
 */
public class Car {

    private String model;
    private String brand;

    public Car() {}

    public Car(String model, String brand, int photo) {
        this.model = model;
        this.brand = brand;
        this.photo = photo;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
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

    private int photo;


}
