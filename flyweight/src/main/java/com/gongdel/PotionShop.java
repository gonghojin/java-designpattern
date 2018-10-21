package com.gongdel;

import java.util.List;

public class PotionShop {

    List<Potion> topShelf;
    List<Potion> bottomShelf;

    public PotionShop(List<Potion> topShelf, List<Potion> bottomShelf) {
        this.topShelf = topShelf;
        this.bottomShelf = bottomShelf;
        fillShelves();
    }

    private void fillShelves() {
        topShelf.add(new InvisibilityPotion());
        topShelf.add(new InvisibilityPotion());
        topShelf.add(new StrengthPotion());
        topShelf.add(new HealingPotion());
        topShelf.add(new InvisibilityPotion());
        topShelf.add(new StrengthPotion());
        topShelf.add(new HealingPotion());
        topShelf.add(new HealingPotion());

        bottomShelf.add(new PoisonPotion());
        bottomShelf.add(new PoisonPotion());
        bottomShelf.add(new PoisonPotion());
        bottomShelf.add(new HolyWaterPotion());
        bottomShelf.add(new HolyWaterPotion());
    }

    public void enumber() {
        System.out.println("Enumerating top shelf potions\n");
        for (Potion p: topShelf) {
            p.drink();
        }

        System.out.println("\nEnumerating bottom shelf potions\n");
        for (Potion p: bottomShelf) {
            p.drink();
        }

    }
}
