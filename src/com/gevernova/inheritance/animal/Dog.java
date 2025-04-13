package com.gevernova.inheritance.animal;

public class Dog extends Animal{
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says Bow");
    }
}
