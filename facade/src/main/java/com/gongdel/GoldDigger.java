package com.gongdel;

public class GoldDigger extends MineWorker {

    @Override
    public void work() {
        System.out.println(name() + " digs for gold.");
    }

    @Override
    public String name() {
        return "Dwarf gold digger";
    }

}
