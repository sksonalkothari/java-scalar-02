package com.scalar.greetings;

public class Greetings {
    /**
     * write a function which prints the appropriate greeting message based on the time of the day
     */

    public void greet() {
        int hour = java.time.LocalTime.now().getHour();
        if(hour < 12){
            System.out.println("Good Morning!!");
        } else if(hour < 16){
            System.out.println("Good Afternoon!!");
        } else if(hour < 20){
            System.out.println("Good Evening!!");
        } else {
            System.out.println("Good Night!!");
        }
    }
}
