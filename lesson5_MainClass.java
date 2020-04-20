package ru.homework.lesson5;
//
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Расстояние для бега: ");
        double distance_run = in.nextInt();
        System.out.println("Расстояние для плавания: ");
        double distance_sw = in.nextInt();
        System.out.println("Расстояние прыжка: ");
        double distance_jump = in.nextInt();

        Cat Cat = new Cat("Cat", 200, 0, 2);
        Dog Dog = new Dog("Dog", 500, 10, 0.5);
        Horse Horse = new Horse("Horse", 1500, 100, 3);
        Bird Bird = new Bird("Bird", 5, 0, 0.2);

        Cat.running(distance_run);
        Cat.swimming(distance_sw);
        Cat.jumping(distance_jump);

        Dog.running(distance_run);
        Dog.swimming(distance_sw);
        Dog.jumping(distance_jump);

        Horse.running(distance_run);
        Horse.swimming(distance_sw);
        Horse.jumping(distance_jump);

        Bird.running(distance_run);
        Bird.swimming(distance_sw);
        Bird.jumping(distance_jump);
    }
}
