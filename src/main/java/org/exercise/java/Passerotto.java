package org.exercise.java;

public class Passerotto extends Animale implements IVolante {

	@Override
	public void verso() {
		System.out.println("cip cip");

	}

	@Override
	public void mangia() {
		System.out.println("vermi");

	}

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");

	}

}
