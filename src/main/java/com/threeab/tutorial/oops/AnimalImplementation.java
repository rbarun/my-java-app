package com.threeab.tutorial.oops;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class AnimalImplementation {

	public static void main(String[] args) {
	
		
		AnimalImplementation ai = new AnimalImplementation();
		Cat c = new Cat();
		Lion l = new Lion();
		Dog d = new Dog();
		Tiger t = new Tiger();
		
		System.out.println("Is Cat friendly : " + c.isFriendly());
		System.out.println("My Cat makes sound like : " + c.sound());
		System.out.println();
		
		
		System.out.println("Is Lion friendly : " + l.isFriendly());
		System.out.println("My Lion makes sound like : " + l.sound());
		System.out.println();
		
		System.out.println("Is Dog friendly : " + d.isFriendly());
		System.out.println("My Dog makes sound like : " + d.sound());
		System.out.println();
		
		System.out.println("Is Tiger friendly : " + t.isFriendly());
		System.out.println("My Tiger makes sound like : " + t.sound());
		System.out.println();
		
		Scanner input = new Scanner(System.in);
		String animaltype = input.next();
		
/**
 * Polymorphism:
 * Certain information is hidden for the a object yet it carries out its methods
 */
		Animal a = ai.getAnimal(animaltype);
		System.out.println("is this Animal friendly : " + a.isFriendly());
		System.out.println("this Animal makes sound like : " + a.sound());
	}

	
	
	public Animal getAnimal(String animaltype) {
		Animal a;
		if (animaltype.equalsIgnoreCase("c")){
		  a = new Cat();
		} else {
			a = new Lion();
		}
		return a;
	}
	
}