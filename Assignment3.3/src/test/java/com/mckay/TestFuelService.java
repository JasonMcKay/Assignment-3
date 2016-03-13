package com.mckay;

import com.mckay.config.AppConfig;
import com.mckay.domian.FuelData;
import com.mckay.service.FuelService;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Jason McKay on 2016/03/13.
 */
public class TestFuelService
{
    private FuelService service;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (FuelService)context.getBean("diesel");
    }

    @Test
    public void testFuel() throws Exception
    {
        FuelData data = service.getFuelType();
        System.out.println("Type of fuel is: " + service.getFuelType().toString());

        Assert.assertEquals(data.getForm(), "Liquid");
    }

    @Test
    public void testPrice() throws Exception
    {


    }
}
