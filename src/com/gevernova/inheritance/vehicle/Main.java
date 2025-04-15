package com.gevernova.inheritance.vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle Mustang = new Car("Petrol", 260, 4);
        Vehicle Volvo = new Truck("Disel", 110, 12);
        Vehicle Hayabusa = new MotorCycle("Petrol", 250, 990);
        Vehicle RS7 = new Car("Petrol", 290, 5);
        Vehicle[] arr = {Mustang,Volvo,Hayabusa,RS7};
        for(Vehicle obj : arr){
            obj.displayInfo();
        }

    }
}
