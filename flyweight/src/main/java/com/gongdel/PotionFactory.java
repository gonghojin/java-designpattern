package com.gongdel;

import java.util.EnumMap;

public class PotionFactory {

    private final EnumMap<PotionType, Potion> potions;

    public PotionFactory() {
        this.potions = new EnumMap<PotionType, Potion>(PotionType.class);
    }

    Potion createPotion(PotionType type) {
        Potion potion = potions.get(type);
        if (potion == null) {
         switch (type) {
             case HEALING:
                 potion = new HealingPotion();
                 potions.put(type, potion);
                 break;
             case HOLY_WATER:
                 potion = new HolyWaterPotion();
                 potions.put(type, potion);
                 break;
             case INVISIBILITY:
                 potion = new InvisibilityPotion();
                 potions.put(type, potion);
                 break;
             case STRENGTH:
                 potion = new StrengthPotion();
                 potions.put(type, potion);
                 break;
             default:
                 break;
         }
        }

        return potion;
    }
}
