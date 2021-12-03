package com.vpetelsky.model;

public class Soldier extends MovableUnit {

    public Soldier(Team team) {
        super(team);
        mark = "So";
    }

    public void fire() {
        System.out.println("fire");
    }
}
