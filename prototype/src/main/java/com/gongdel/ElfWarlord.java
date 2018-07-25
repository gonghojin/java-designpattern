package com.gongdel;

public class ElfWarlord extends Warlord {

    public ElfWarlord() {
    }

    public ElfWarlord(ElfWarlord elfWarlord) {
    }

    @Override
    public Warlord clone() throws CloneNotSupportedException {
        return new ElfWarlord(this);
    }

    @Override
    public String toString() {
        return "Elven warlord";
    }

}
