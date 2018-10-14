package com.gongdel;

import java.util.List;

public class Word extends LetterComposite {

    public Word(List<Letter> letters) {
        for (Letter l : letters) {
            this.add(l);
        }
    }

    @Override
    protected void printThisBefore() {

    }

    @Override
    protected void printThisAfter() {
        System.out.print(" ");
    }
}
