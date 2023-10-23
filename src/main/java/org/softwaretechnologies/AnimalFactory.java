package org.softwaretechnologies;

import org.softwaretechnologies.animals.Animal;
import org.softwaretechnologies.animals.AnimalType;

public class AnimalFactory {

    /**
     * Метод для создания животных по типу
     * @param name - имя животного
     * @param type - тип животного
     * @return животное, соответствующее каждому из типов.
     */


    public static Animal createAnimal(String name, AnimalType type) {
        /* TODO в зависимости от type создайте и верните нужное животное */

        /* return switch (type){
            case Manager -> new Manager(name, baseSalary);
            case Programmer -> new Programmer(name, baseSalary);
            case Tester -> new Tester(name, baseSalary);
        }; */


        return null;
    }
}
