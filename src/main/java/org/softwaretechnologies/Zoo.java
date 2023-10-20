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
     * Вовращаемый список звуков: moo, woof, meow, woof, meow, woof, moo
     *
     * @return Звуки животных, в алфавитном порядке имени животного.
     */
    public List<String> soundAllAnimalsSortByName() {
        List<String> sounds = new ArrayList<>();
        // TODO заполните корректно список звуков
        Comparator <Animal> animaalComparator = new Comparator<Animal>() {
            @Override
            public int compare(Animal animal, Animal t1) {
                return animal.getName().compareTo(t1.getName());
            }
        };
        Collections.sort(animalList, animaalComparator);
        for (Animal a:animalList){
            sounds.add(a.sound());
        }
        return sounds;
    }


}
