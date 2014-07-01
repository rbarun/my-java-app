package com.threeab.tutorial.oops;

public abstract class PetAnimal extends Animal {
	
	public PetAnimal() {
		this.friendly = new Boolean(true);
	}

	@Override
	public Boolean isFriendly() {
      return this.friendly;
	}
}
