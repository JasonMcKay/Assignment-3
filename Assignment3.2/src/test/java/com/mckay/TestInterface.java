package com.mckay;

import com.mckay.domain.FuelData;
import com.mckay.service.Diesel;
import com.mckay.service.FuelService;
import com.mckay.service.Leaded;
import com.mckay.service.Unleaded;
import org.junit.*;

/**
 * Created by Jason McKay on 2016/03/12.
 */

public class TestInterface
{
    private FuelService service;
    @Before
    public void setUp() throws Exception
    {


    }

    @Test
    public void testCars() throws Exception
    {
        service = new Unleaded();
        System.out.println("Type of fuel is: " + service.getFuelType().getType());

        Assert.assertEquals(service.getFuelType().getForm(), "Liquid");
    }

    @Test
    public void testTruck() throws Exception {
        service = new Diesel();
        System.out.println("Type of fuel is: " + service.getFuelType().getType());

        Assert.assertEquals(service.getFuelType().getForm(), "Liquid");
    }

    @Test
    public void testOldCars() throws Exception {
        service = new Leaded("1967 ford");
        System.out.println("Type of fuel is: " + service.getFuelType().getType());
        System.out.println(service.toString());

        Assert.assertEquals(service.getFuelType().getForm(), "Liquid");
    }
}
