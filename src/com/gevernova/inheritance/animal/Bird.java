package com.gevernova.inheritance.animal;

public class Bird extends Animal{
    public Bird(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says Chirp");
    }
}
