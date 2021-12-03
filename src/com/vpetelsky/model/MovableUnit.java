package com.vpetelsky.model;

public class MovableUnit extends Unit {

    public MovableUnit(Team team) {
        super(team);
    }

    public void move() {
        System.out.println("move");
    }
}
