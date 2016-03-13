package com.mckay.domain;

import java.io.Serializable;

/**
 * Created by Jason McKay on 2016/03/12.
 */
public class FuelData implements Serializable
{
    private String form;
    private String type;

    public FuelData()
    {

    }

    public String getForm()
    {
        return form;
    }

    public void setForm(String fuelForm)
    {
        this.form = fuelForm;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String fuelType)
    {
        this.type = fuelType;
    }

    @Override
    public String toString()
    {
        return "Type of fuel: " + type + " in " + form + " form";
    }
}
