package fr.imie;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * *********************************************************************
		 * ** 1) Création de la bibliothèque
		 * *********************************************************************
		 * **
		 */
		MoteurBibliotheque moteurBibliotheque = new MoteurBibliotheque();

		/*
		 * *********************************************************************
		 * ** 2) Création des bibliothecaires
		 * *********************************************************************
		 * **
		 */
		List<Bibliothecaire> bibliothecaires = new ArrayList<>();

		bibliothecaires.add(new Bibliothecaire("Roger", moteurBibliotheque));


		/*
		 * Liste de bibliothecaires
		 */
		System.out.println("******************************************"
				+ "\n----------------\nListe de bibliothecaires:\n----------------");
		for (Bibliothecaire bibliothecaire : bibliothecaires) {
			System.out.println(bibliothecaire.getNom());
		}
		System.out.println("******************************************\n");
		
		/*
		 * *********************************************************************
		 * ** 3) Création des livres
		 * *********************************************************************
		 * **
		 */
		List<Livre> livres = new ArrayList<>();

		livres.add(new Livre("Le petit prince"));
		livres.add(new Livre("Moto Magazine Avril 2003"));

		/*
		 * Liste de livres
		 */
		System.out.println("******************************************"
				+ "\n----------------\nListe de livres:\n----------------");
		for (Livre livre : livres) {
			System.out.println(livre.getNom());
		}
		System.out.println("******************************************\n");

		/*
		 * *********************************************************************
		 * ** 4) Création des adherents
		 * *********************************************************************
		 * **
		 */
		List<Adherent> adherents = new ArrayList<>();

		adherents.add(new Adherent("Le petit prince"));
		adherents.add(new Adherent("Moto Magazine Avril 2003"));

		/*
		 * Liste de adherents
		 */
		System.out.println("******************************************"
				+ "\n----------------\nListe de adherents:\n----------------");
		for (Adherent adherent : adherents) {
			System.out.println(adherent.getNom());
		}
		System.out.println("******************************************\n");

	}

}
