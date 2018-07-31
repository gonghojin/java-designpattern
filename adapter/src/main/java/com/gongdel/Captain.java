package com.gongdel;

public class Captain implements RowingBoat{

    private RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    @Override
    public void row() {
        rowingBoat.row();
    }
}
/**
    자체 분석:

       음.. 왜 직접 FishingBoat에다가 RowingBoat를 implements
 **/