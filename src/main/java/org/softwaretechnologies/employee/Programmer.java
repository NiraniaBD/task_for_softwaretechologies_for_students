package org.softwaretechnologies.employee;
public class Programmer extends Employee{
    String name;
    int baseSalary;
    String type;

    protected Programmer(String name, int baseSalary) {
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
