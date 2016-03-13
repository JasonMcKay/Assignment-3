package com.mckay;

/**
 * Created by Jason McKay on 2016/03/10.
 */
import java.util.ArrayList;

public class ArrayLists
{
    private ArrayList<String> cars = new ArrayList<String>();
    private String brands[] = {"Toyota", "Merc", "BMW", "VW", "Bugatti", "Toyota", "Jeep", "Subaru", "Ford", "Toyota"};

    public ArrayLists()
    {
        for(int i = 0; i < 10; i++)
        {
            cars.add(i, brands[i]);
        }
        System.out.println("ArrayList: " + cars);
    }

    public String getFavouriteCar(int i)
    {
        System.out.println("Returned value: " + cars.get(i));
        String car = cars.get(i);
        return car;
    }
}
