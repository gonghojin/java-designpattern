package com.gongdel;

public class Letter extends LetterComposite {

    private char c;

    public Letter(char c) {
        this.c = c;
    }

    protected void printThisBefore() {
        System.out.print(c);
    }

    protected void printThisAfter() {
    }
}
