package ru.geekbrains.api.DZ6;

import java.util.Objects;

public class Cats {
    int id;
    int age;
    double weight;
    String nickName;

    @Override
    public String toString() {
        
        return String.format("Номер п/п: %d Возраст: %d Вес: %f.2 Кличка: %s", id, age, weight, nickName);
        
    }

    @Override
    public boolean equals(Object o) {
        Cats cats = (Cats) o;
        return age == cats.age && weight == cats.weight;
    }


    @Override
    public int hashCode() {
        return Objects.hash(age, weight);
    }
}
