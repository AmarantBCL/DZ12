package com.vpetelsky.units;

public class Tower extends Structure {

    public Tower() {
        isBreakable = false;
    }

    @Override
    public String toString() {
        return "Tower{" +
                "isBreakable=" + isBreakable +
                '}';
    }
}
