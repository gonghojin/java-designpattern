package com.gongdel;

public class Hero {
    private final Profession profession;
    private final String name;
    private final HairType hairType;
    private final HairColor hairColor;
    private final Armor armor;
    private final Weapon weapon;

    private Hero(HeroBuilder builder) {
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.hairType = builder.hairType;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(profession);
        sb.append(" named ");
        sb.append(name);
        if (hairColor != null || hairType != null) {
            sb.append(" with ");
            if (hairColor != null) {
                sb.append(hairColor);
                sb.append(" ");
            }
            if (hairType != null) {
                sb.append(hairType);
                sb.append(" ");
            }
            sb.append(hairType != HairType.BOLD ? "hair" : "head");
        }
        if (armor != null) {
            sb.append(" wearing ");
            sb.append(armor);
        }
        if (weapon != null) {
            sb.append(" and wielding ");
            sb.append(weapon);
        }
        sb.append(".");
        return sb.toString();
    }

    public static class HeroBuilder {

        private final Profession profession;
        private final String name;
        private HairType hairType;
        private HairColor hairColor;
        private Armor armor;
        private Weapon weapon;

        public HeroBuilder(Profession profession, String name) {
            if (profession == null || name == null) {
                throw new NullPointerException("profession and name can not be null");
            }
            this.profession = profession;
            this.name = name;
        }

        public HeroBuilder withHairType(HairType hairType) {
            this.hairType = hairType;
            return this;
        }

        public HeroBuilder withHairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public HeroBuilder withArmor(Armor armor) {
            this.armor = armor;
            return this;
        }

        public HeroBuilder withWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }

    }
}
