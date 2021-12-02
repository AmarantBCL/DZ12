package com.vpetelsky.units;

public class Soldier extends Unit {

    public void move() {
        System.out.println("move");
    }

    public void fire() {
        System.out.println("fire");
    }

    @Override
    public String toString() {
        return "Soldier{}";
    }
}
