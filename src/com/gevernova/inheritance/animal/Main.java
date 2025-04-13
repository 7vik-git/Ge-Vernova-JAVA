package com.gevernova.inheritance.animal;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Bruno", 3);
        Animal cat1 = new Cat("Snowfalke", 2);
        Animal bird1 = new Bird("Birdie", 1);
        dog1.makeSound();
        bird1.makeSound();
    }
}
