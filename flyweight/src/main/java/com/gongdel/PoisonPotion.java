package com.gongdel;

public class PoisonPotion implements Potion {

	@Override
	public void drink() {
		System.out.println("Urgh! This is poisonous.");
	}

}
