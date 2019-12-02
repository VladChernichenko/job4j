package ru.job4j.calculator;

public class CarUsage {
    public static void main(String[] args) {
        Car audi = new Car();
        boolean driving = audi.canDrive();
        System.out.println("Can you drive?: " + driving);
        System.out.println("I am going to gas station");
        int gas = 25;
        audi.fill(gas);
        driving = audi.canDrive();
        System.out.println("Can you drive now? " + driving);
        System.out.println("Now, i am going to my granny");
        System.out.println("it's 10 km from here");
        int distance = 10;
        audi.drive(distance);
        audi.gasInfo();
    }
}
