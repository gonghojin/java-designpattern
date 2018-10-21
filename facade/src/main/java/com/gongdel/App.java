package com.gongdel;

public class App {

    public static void main(String[] args) {
        GoldMineFacade goldMineFacade = new GoldMineFacade();
        goldMineFacade.startNewDay();
        goldMineFacade.digOutGold();
        goldMineFacade.endDay();
    }
}
