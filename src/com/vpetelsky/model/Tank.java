package com.vpetelsky.model;

public class Tank extends MovableUnit {

    public Tank(Team team) {
        super(team);
        mark = "Tk";
    }

    public void fire() {
        System.out.println("fire");
    }

    public void reload() {
        System.out.println("reload");
    }
}
