package home_work;

import java.io.Serializable;
import java.util.Objects;

public class Parrot implements Serializable {
//    Создайте класс Parrot (попугай).
//    У попугая должно быть имя, цвет, возраст, количество слов, которые он знает.
//    Создайте объект попугая, дав ему любые значения характеристик.
//    Запишите объект в файл, используя ObjectOutputStream.
//    Считайте объект из файла и выведите его в консоль.
//    Запишите объект в файл в формате JSON.
//    Считайте объект из файла и выведите его в консоль.

    private String name;
    private String color;
    private int age;
    private int knownWords;

    public Parrot(){

    }

    public Parrot(String name, String color, int age, int knownWords) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.knownWords = knownWords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKnownWords() {
        return knownWords;
    }

    public void setKnownWords(int knownWords) {
        this.knownWords = knownWords;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Parrot parrot = (Parrot) o;
        return age == parrot.age && knownWords == parrot.knownWords && Objects.equals(name, parrot.name) && Objects.equals(color, parrot.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age, knownWords);
    }

    @Override
    public String toString() {
        return String.format("Имя попугая - %s, цвет попугая - %s, возраст попугая - %d," +
                " количество слов, которые знвет попугай - %d", name, color, age, knownWords);
    }
}
