package com.mckay;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jason McKay on 2016/03/10.
 */
public class Mapping
{
    private Map<Long, String> students = new HashMap<Long, String>();
    private long studentNumbers[] = {214022560, 214793458, 214001560, 213990856};
    private String names[] = {"Jason Mckay", "Cesca Swan", "mike louw", "james peach"};

    public Mapping()
    {
        for (int i = 0; i < 4; i++)
        {
            students.put(studentNumbers[i], names[i]);
        }

        System.out.println("Map: " + students + " " + students.size());
    }

    public boolean getStudent()
    {
        return students.containsValue("Jason Mckay");
    }
}
