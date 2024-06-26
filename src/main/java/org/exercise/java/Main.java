package org.exercise.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animale aquila = new Aquila();
		Cane cane = new Cane();
		Delfino delfino = new Delfino();
		Animale passerotto = new Passerotto();

		Animale[] animali = new Animale[4];

		animali[1] = aquila;
		animali[2] = cane;
		animali[3] = delfino;
		animali[0] = passerotto;

		for (Animale animale : animali) {
			System.out.println(animale.getClass().getSimpleName());
			animale.dormi();
			animale.verso();
			animale.mangia();
			System.out.println("- - - - ");
		}

	}

}
