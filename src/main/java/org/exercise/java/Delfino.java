package org.exercise.java;

public class Delfino extends Animale implements INuotante {

	@Override
	public void verso() {
		System.out.println("hi hi hi");

	}

	@Override
	public void mangia() {
		System.out.println("pesce");

	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");

	}
}
