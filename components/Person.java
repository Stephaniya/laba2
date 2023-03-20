package com.github.rsoi.components;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Person {
    private String name;
    private int age;
    private int experience;
    private ArrayList<Violation> violations = new ArrayList<>();
    private ArrayList<Travel> travels = new ArrayList<>();


    public Person(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", violations=" + violations +
                ", travels=" + travels +
                '}';
    }
}
