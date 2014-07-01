package com.threeab.tutorial.oops;

public abstract class WildAnimal extends Animal {

	public WildAnimal() {
		this.friendly = new Boolean(false);
	}

	@Override
	public Boolean isFriendly() {
      return this.friendly;
	}
}
