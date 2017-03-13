package org.study.collection;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;

public class PriorityQueueTest
{
    public static void testPriorityQueue()
    {
        PriorityQueue<GregorianCalendar> pq = new PriorityQueue<>();
        pq.add(new GregorianCalendar(1906, Calendar.DECEMBER, 9));
        pq.add(new GregorianCalendar(1815, Calendar.DECEMBER, 10));
        pq.add(new GregorianCalendar(1903, Calendar.DECEMBER, 3));
        pq.add(new GregorianCalendar(1910, Calendar.JUNE, 22));

        System.out.println("Iterating over elements...");
        for (GregorianCalendar gc : pq) {
            System.out.println(gc.get(Calendar.YEAR));
        }
        System.out.println("Remove elements...");

        while (!pq.isEmpty()) {
            System.out.println(pq.remove().get(Calendar.YEAR));
        }
    }
}
