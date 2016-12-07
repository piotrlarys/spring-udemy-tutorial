package com.udemy.spring.tutorial;

/**
 * @author Piotr Larys
 */
public class MyApp {
    public static void main(String[] args) {
        Coach theCoach = new BaseBallCoach();
        System.out.println(theCoach.getDailyWorkout());
    }
}
