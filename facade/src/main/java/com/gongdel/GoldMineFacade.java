package com.gongdel;

import java.util.ArrayList;
import java.util.List;

public class GoldMineFacade {

    private List<MineWorker> workes;

    public GoldMineFacade() {
        workes = new ArrayList<>();
        workes.add(new CartOperator());
        workes.add(new GoldDigger());
        workes.add(new TunnelDigger());
    }

    public void startNewDay() {
        for (MineWorker worker : workes) {
            worker.wakeUp();
            worker.goMine();
        }
    }

    public void digOutGold() {
        for (MineWorker worker : workes) {
            worker.work();
        }
    }

    public void endDay() {
        for (MineWorker worker : workes) {
            worker.goHome();
            worker.goToSleep();
        }
    }

}
