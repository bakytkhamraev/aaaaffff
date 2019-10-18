package com.company;

public abstract class Sportsman {
    public abstract void strikeForce();
    public abstract void doExercises();
    public abstract void sayYourname();

    private int age;
    private int force;
    private String gender;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
