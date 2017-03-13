package org.study.threading.unsynch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank
{
    private final List<Account> accounts;

    public Bank()
    {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account a)
    {
        accounts.add(a);
    }

    public synchronized void transfer(Account from, Account to, double amount) throws InterruptedException
    {

        while (from.getBalance() < amount)
            wait();

        System.out.print(Thread.currentThread());

        from.lessBalance(amount);

        System.out.printf("%10.2f from %s to %s", amount, from, to);

        to.upBalance(amount);

        System.out.printf("Total Balance: %10.2f\n", getTotalBalance());

        notifyAll();
    }

    public synchronized double getTotalBalance()
    {
        double sum = 0;
        for (Account a : accounts)
            sum += a.getBalance();

        return sum;
    }
}
