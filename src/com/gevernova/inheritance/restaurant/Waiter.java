package com.gevernova.inheritance.restaurant;

public class Waiter extends Person implements Worker{
    String performDuties;
    public Waiter(String name, int age, String duties){
        this.name=name;
        this.age=age;
        this.performDuties=duties;
    }
    @Override
    public void implementsDuties() {
        System.out.println(name + " performs " + performDuties +" at age "+ age);
    }
}
