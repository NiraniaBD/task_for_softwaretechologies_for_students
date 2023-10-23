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

    private static class Cat {
        public String getSound(){
            return "meow";
        }
    }

    private static class Cow {
        public String getSound(){
            return "moo";
        }
    }

    private static class Dog{
        public String getSound(){
            return "woof";
        }
    }

    public abstract String sound();
}
