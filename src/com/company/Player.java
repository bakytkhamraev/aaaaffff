package com.company;

public class Player extends Sportsman {


    @Override
    public void strikeForce() {
        System.out.println("Футболист ударил по мячу");
    }

    @Override
    public void doExercises() {System.out.println("Футболист потренировался ");

    }

    @Override
    public void sayYourname() {System.out.println("Футболиста зовут Месси");

    }
}
