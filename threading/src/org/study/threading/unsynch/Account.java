package org.study.threading.unsynch;

public class Account
{
    private String name;
    private double balance;

    public Account(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }

    public String toString()
    {
        return "<name=" + name + ",balance=" + balance + "@Account>";
    }

    public void lessBalance(double amount)
    {
        this.balance -= amount;
    }

    public void upBalance(double amount)
    {
        this.balance += amount;
    }
}
