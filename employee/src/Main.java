
import org.study.employee.*;

import java.util.Arrays;

public class Main
{
    public static void main(String... args)
    {
        Pair<Employee> pe = new Pair<>();
        pe.setFirst(new Employee("zhangmoing", 123));

        System.out.println(pe.getFirst());

        System.out.println(ArrayAlg.getMiddle("asdf", "asdf"));

        double middle = ArrayAlg.getMiddle(3.14, 1729.0, 0.1);

        String[] pp = {"张三", "李四"};

        System.out.println(ArrayAlg.min(pp));

        printBuddies(pe);

        Manager ceo = new Manager("ceo1", 30, 8000);
        Manager cfo = new Manager("cfo", 31, 70000);

        Pair<Manager> managerBuddies = new Pair<>(ceo, cfo);

        Manager[] managers = new Manager[2];
        managers[0] = ceo;
        managers[1] = cfo;

        minmaxBonus(managers, pe);

        try {
            System.out.println(Class.forName("org.study.employee.Employee"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printBuddies(Pair<? extends Employee> p)
    {
        System.out.println(p);
    }

    public static void minmaxBonus(Manager[] a, Pair<? super Manager> result)
    {
        System.out.println(Arrays.deepToString(a));
        System.out.println(result);
    }
}


