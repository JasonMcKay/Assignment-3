package com.mckay.service.impl;

import com.mckay.domian.FuelData;
import com.mckay.service.FuelService;

/**
 * Created by Jason McKay on 2016/03/13.
 */
public class UnleadedServiceImpl implements FuelService
{

    public FuelData getFuelType()
    {
        FuelData fuelData = new FuelData();
        fuelData.setForm("Liquid");
        fuelData.setType("Unleaded");
        fuelData.setPrice(14.20);
        return fuelData;
    }
}
