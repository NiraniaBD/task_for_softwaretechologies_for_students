package org.softwaretechnologies;

import org.softwaretechnologies.animals.Animal;
import org.softwaretechnologies.animals.AnimalType;

import java.util.*;

public class Zoo {
    private final List<Animal> animalList = new ArrayList<>();
    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    /**
     * Метод должен возвращать список звуков животных.
     * Звуки животных должны быть отсортированы по имени животного. Пример
     * Животные:
     *
     * Корова: Яша
     * Кошка: Дуся
     * Собака: Жучка
     * Корова: Абракадабра
     * Собака: Шарик
     * Кошка: Мурзик
     * Собака: Бобик
     *
     * Возвращаемый список звуков: moo, woof, meow, woof, meow, woof, moo
     *
     * @return Звуки животных, в алфавитном порядке имени животного.
     */

    //возвращает список строк, содержащий звуки всех животных, отсортированных по имени
    public List<String> soundAllAnimalsSortByName() {
        //создается пустой список строк sounds, который б/содержать звуки животных
        List<String> sounds = new ArrayList<>();
        // TODO заполните корректно список звуков

        //создается объект Comparator<Animal> с помощью анонимного класса
        // который реализует интерфейс Comparator и переопределяет метод compare()
        // метод compare() сравнивает имена двух животных (полученных в качестве параметров)
        // и возвращает результат сравнения
        Comparator <Animal> animalComparator = new Comparator<Animal>() {
            @Override
            public int compare(Animal animal, Animal t1) {
                return animal.getName().compareTo(t1.getName());
            }
        };

        //список animalList сортируется с использованием animalComparator
        //по именам животных в порядке возрастания

        //для каждого животного a из отсортированного списка animalList
        //вызывается метод sound(), который возвращает звук данного животного
        // полученный звук добавляется в список sounds
        Collections.sort(animalList, animalComparator);
        for (Animal a:animalList){
            sounds.add(a.sound());
        }

        return sounds;
    }


}
