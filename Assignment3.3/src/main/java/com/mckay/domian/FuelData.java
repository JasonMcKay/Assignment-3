package com.mckay.domian;

import java.io.Serializable;

/**
 * Created by Jason McKay on 2016/03/13.
 */
public class FuelData implements Serializable
{
    private String form;
    private double price;
    private String type;

    public String getForm()
    {
        return form;
    }

    public void setForm(String form)
    {
        this.form = form;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String toString()
    {
        return type+" @ R"+price;
    }
}
