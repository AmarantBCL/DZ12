package com.vpetelsky.model;

public class Unit {

    protected int x;
    protected int y;
    protected String mark;
    protected Team team;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getMark() {
        return mark;
    }

    public Team getTeam() {
        return team;
    }

    public Unit(Team team) {
        this.team = team;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
