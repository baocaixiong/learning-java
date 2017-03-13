package org.study.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetTest
{
    public static void setTest()
    {
        Set<String> words = new HashSet<>();
        long totalTime = 0;

        Scanner in = new Scanner(System.in);
        while (words.size() < 10) {
            String word = in.next();
            System.out.println(word);
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
        }

        Iterator<String> iter = words.iterator();
        for (int i = 0; i < 20 && iter.hasNext(); i++) {
            System.out.println(iter.next());
        }

        System.out.println("...");
        System.out.println(words.size() + "disttinct words. " + totalTime + "millisSeconds.");
    }
}
