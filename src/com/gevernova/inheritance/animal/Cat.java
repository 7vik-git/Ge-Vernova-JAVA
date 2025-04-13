package com.gevernova.inheritance.animal;

public class Cat extends Animal{
     public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println(name + "says Meowww");
    }
}
