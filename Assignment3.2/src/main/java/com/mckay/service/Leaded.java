package com.mckay.service;

import com.mckay.domain.FuelData;

/**
 * Created by Jason McKay on 2016/03/12.
 */
public class Leaded implements FuelService
{
    private String make;

    public Leaded(String makeOfCar)
    {
        this.make = makeOfCar;
    }

    public String getMake()
    {
        return make;
    }

    public String toString()
    {
        return "Make of car is: " + make;
    }

    public FuelData getFuelType()
    {
        FuelData fuelType = new FuelData();
        fuelType.setForm("Liquid");
        fuelType.setType("Leaded");

        return fuelType;
    }
}
