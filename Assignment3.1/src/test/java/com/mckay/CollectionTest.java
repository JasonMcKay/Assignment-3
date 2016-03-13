package com.mckay;

import org.junit.*;

/**
 * Created by Jason McKay on 2016/03/09.
 */
public class CollectionTest
{
    @Before
    public void setUp() throws Exception
    {


    }

    @Test
    public void testArrayList() throws Exception
    {

        ArrayLists list = new ArrayLists();
        String result = list.getFavouriteCar(9);

        Assert.assertEquals("Not my favourite car!", "Toyota", result);
    }

    @Test
    public void testSets() throws Exception
    {
        Sets set = new Sets();
        boolean result = set.getNumber();

        Assert.assertTrue("Value doesn't exist", result);
    }

    @Test
    public void testMapping() throws Exception
    {
        Mapping map = new Mapping();
        boolean result = map.getStudent();

        Assert.assertTrue("Student doesn't exist", result);
    }
}
