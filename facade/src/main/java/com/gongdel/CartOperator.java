package com.gongdel;

public class CartOperator extends MineWorker {

    @Override
    public String name() {
        return "Dwarf cart operator";
    }

    @Override
    public void work() {
        System.out.println(name() + " moves gold chunks out of the mine.");
    }
}
