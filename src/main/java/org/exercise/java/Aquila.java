package org.exercise.java;

public class Aquila extends Animale implements IVolante {

	@Override
	public void verso() {
		System.out.println("CIIIIP");

	}

	@Override
	public void mangia() {
		System.out.println("topo");

	}

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");

	}

}
