package org.softwaretechnologies.animals;

import java.time.LocalDate;
import java.time.YearMonth;

public abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Создайте три класса животных: кошка, корова, собака.
     * Кошка должна издавать звук: "meow"
     * Корова должна издавать звук: "moo"
     * Собака должна издавать звук: "woof"
     * @return Метод должен возвращать строку, соответсвующую издаваемого животным звука.
     */

   /* private static class Tester extends Employee {
        protected Tester(String name, int baseSalary) {
            super(name, baseSalary);
        }

        @Override
        public int getMonthSalary(int month) {
            return baseSalary * YearMonth.of(LocalDate.now().getYear(), month).lengthOfMonth();
        }
    } */


    private static class Cat {

    }

    private static class Cow{

    }

    private static class Dog{

    }

    public abstract String sound();
}
