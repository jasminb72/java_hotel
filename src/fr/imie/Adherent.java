package fr.imie;

public class Adherent {
	private int numero;
	private String nom;
	private InterfaceMoteurBibliotheque IBibliotheque;

	public Adherent(String nom) {
		this.nom = nom;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public InterfaceMoteurBibliotheque getIMoteurBibliotheque() {
		return IBibliotheque;
	}

	public void setIMoteurBibliotheque(InterfaceMoteurBibliotheque iBibliotheque) {
		IBibliotheque = iBibliotheque;
	}

}
