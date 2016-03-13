package com.mckay;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Jason McKay on 2016/03/10.
 */

public class Sets
{
    private Set<Integer> numbers = new HashSet<Integer>();
    private int nums[] = {34, 22, 40, 30, 23, 22};

    public Sets()
    {
        for(Integer i : nums)
        {
            numbers.add(i);
        }

        System.out.println("Set: " + numbers);

        TreeSet<Integer> sortedSet = new TreeSet<Integer>(numbers);

        System.out.println("Sorted set: " + sortedSet);
    }

    public boolean getNumber()
    {
        System.out.println("numbers.contains(23) : " + numbers.contains(23));
        return numbers.contains(23);
    }
}
