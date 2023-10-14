package org.softwaretechnologies.employee;

public class Tester extends Employee {

    String name;
    int baseSalary;
    String type;

    protected Tester(String name, int baseSalary) {
        super(name, baseSalary);
    }

    int getMonthSalary(){

        return 0;
    }

    @Override
    public int getMonthSalary(int month) {
        return 0;
    }
}
