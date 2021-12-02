package com.vpetelsky.units;

public class Tank extends Soldier {

    public void reload() {
        System.out.println("reload");
    }

    @Override
    public String toString() {
        return "Tank{}";
    }
}
