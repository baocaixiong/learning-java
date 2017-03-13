package org.study.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test1
{
    public static void test1()
    {
        List<String> staff = new LinkedList<>();
        staff.add("Amy");
        staff.add("Bob");
        staff.add("Carl");

        Iterator iter = staff.iterator();

        String first = (String) iter.next();
        String second = (String) iter.next();
        iter.remove();

        System.out.println(first);
        System.out.println(second);
        System.out.println(staff);
    }
}
