package com.gongdel;

public abstract class MineWorker {

    public void goToSleep() {
        System.out.println(name() + " goes to sleep.");
    }

    public void wakeUp() {
        System.out.println(name() + " wakes up.");
    }

    public void goHome() {
        System.out.println(name() + " goes home.");
    }

    public void goMine() {
        System.out.println(name() + " goes to the mine.");
    }
    public abstract String name();
    public abstract void work();
}
