package com.mckay.service;

import com.mckay.domain.FuelData;

/**
 * Created by Jason McKay on 2016/03/12.
 */
public class Diesel implements FuelService
{

    public FuelData getFuelType()
    {
        FuelData fuelType = new FuelData();
        fuelType.setForm("Liquid");
        fuelType.setType("Diesel");

        return fuelType;
    }
}
