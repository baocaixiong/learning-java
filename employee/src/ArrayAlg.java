
import java.lang.Comparable;

public class ArrayAlg
{
    public static <T> T getMiddle(T... a)
    {
        return a[a.length / 2];
    }

    public static <T extends Comparable<T>> T min(T[] a)
    {
        if (a == null || a.length == 0) return null;

        T smallest = a[0];

        for (T anA : a) {
            if (smallest.compareTo(anA) > 0) smallest = a[0];
        }

        return smallest;
    }
}


