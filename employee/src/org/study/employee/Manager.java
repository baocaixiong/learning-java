package org.study.employee;

public class Manager extends Employee
{
    private double bonus;

    public Manager(String name, int age, double bonus)
    {
        super(name, age);

        this.bonus = bonus;
    }

    public double getBonus()
    {
        return bonus;
    }
}
