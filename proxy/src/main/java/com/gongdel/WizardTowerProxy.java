package com.gongdel;

public class WizardTowerProxy extends WizardTower{

    private static final int NUM_WIZARDS_ALLOWED = 3;

    private int numWizrds;

    @Override
    public void enter(Wizard wizard) {
        if (numWizrds < NUM_WIZARDS_ALLOWED) {
            super.enter(wizard);
            numWizrds++;
        } else {
            System.out.println(wizard + " is not allowed to enter!");
        }
    }
}
