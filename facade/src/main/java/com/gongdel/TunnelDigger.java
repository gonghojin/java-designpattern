package com.gongdel;

public class TunnelDigger extends MineWorker {

    @Override
    public String name() {
        return "Dwarven tunnel digger";
    }

    @Override
    public void work() {
        System.out.println(name() + " creates another promising tunnel.");
    }
}
