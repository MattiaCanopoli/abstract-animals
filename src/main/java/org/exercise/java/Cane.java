package org.exercise.java;

public class Cane extends Animale implements INuotante {

	@Override
	public void verso() {
		System.out.println("Woof");

	}

	@Override
	public void mangia() {
		System.out.println("cibo per cani");

	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");

	}

}
