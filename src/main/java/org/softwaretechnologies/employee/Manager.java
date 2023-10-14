package org.softwaretechnologies.employee;


import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

public class Manager extends Employee{
    String name;
    int baseSalary;
    String type;

    protected Manager(String name, int baseSalary) {
        super(name, baseSalary);
    }

    int getMonthSalary(){
        int month = 0;
        int a = baseSalary * YearMonth.of(LocalDate.now().getYear(), month).lengthOfMonth();
        return 0;
    }

    @Override
    public int getMonthSalary(int month) {
        return 0;
    }
}
