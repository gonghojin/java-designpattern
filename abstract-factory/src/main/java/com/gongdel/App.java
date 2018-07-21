package com.gongdel;

public class App {
    public static void main(String[] args) {
     /*   createKingdom(new ElfKingdomFactory());
        createKingdom(new OrcKingdomFactory());*/
        createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ELF));
        createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ORC));

    }
    public static  void createKingdom(KingdomFactory factory) {
        King king = factory.createKing();
        Castle castle = factory.createCastle();
        Army army = factory.createArmy();
        System.out.println("The kingdom was created.");
        System.out.println(king);
        System.out.println(castle);
        System.out.println(army);
    }
}
