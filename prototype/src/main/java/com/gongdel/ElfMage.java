package com.gongdel;

public class ElfMage extends Mage {

    public ElfMage() {
     }

    public ElfMage(ElfMage elfMage) {
    }

    @Override
    public Mage clone() throws CloneNotSupportedException {
        return new ElfMage(this);
    }

    @Override
    public String toString() {
        return "Elven mage";
    }
}
