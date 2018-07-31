package com.gongdel;

public class App {

    public static void main(String[] args) {
        // 싱글톤 1
        IvoryTower ivoryTower1 = IvoryTower.getInstance();
        IvoryTower ivoryTower2 = IvoryTower.getInstance();

        System.out.println("ivoryTower1=" + ivoryTower1);
        System.out.println("ivoryTower2=" + ivoryTower2);

    }
}
