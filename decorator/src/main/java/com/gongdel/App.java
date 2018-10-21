package com.gongdel;

public class App {

    public static void main(String[] args) {

        System.out.println("A simple looking troll approaches.");
        Troll troll = new Troll();
        troll.attack();
        troll.fleeBattle();

        System.out.println("\nA smart looking troll surprises you.");
        SmartTroll smartTroll = new SmartTroll(new Troll());
        smartTroll.attack();
        smartTroll.fleeBattle();
    }

}
