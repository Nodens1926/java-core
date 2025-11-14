package tasks.task13;

import exceptions.InvalidAgeException;

public class Human {
    private String name;
    private int age;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void isAdult() {
        if (age < 18) {
            throw new InvalidAgeException(" неподходящий возраст ");
        }
    }
}
