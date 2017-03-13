import org.study.threading.unsynch.Account;
import org.study.threading.unsynch.Bank;

public class Main
{
    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;

    public static void main(String... args) throws InterruptedException
    {
        Bank bank = new Bank();

        Account a = new Account("zhangsan", 200);
        Account b = new Account("lisi", 300);

        bank.addAccount(a);
        bank.addAccount(b);

        TextThread.test();

//        try {
//            bank.transfer(a, b, 300.0);
//            bank.transfer(b, a, 400.0);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}

class TextThread
{

    public static void test() throws InterruptedException
    {
        TxtThread tt = new TxtThread();
        new Thread(tt).start();
        new Thread(tt).start();
        new Thread(tt).start();
        new Thread(tt).start();

    }
}

class TxtThread implements Runnable
{
    int num = 100;
    String str = "";

    public void run()
    {
        synchronized (str) {
            while (num > 0) {

                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    e.getMessage();
                }
                System.out.println(Thread.currentThread().getName()
                        + " this is " + num--);
            }
        }
    }
}