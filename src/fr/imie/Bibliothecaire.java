package fr.imie;

public class Bibliothecaire {
	private int id;
	private String nom;
	private InterfaceMoteurBibliotheque interfaceMoteurBibliotheque;

	public Bibliothecaire(String nom, InterfaceMoteurBibliotheque interfaceMoteurBibliotheque) {
		this.nom = nom;
		this.interfaceMoteurBibliotheque = interfaceMoteurBibliotheque;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public InterfaceMoteurBibliotheque getInterfaceMoteurBibliotheque() {
		return interfaceMoteurBibliotheque;
	}

	public void setInterfaceMoteurBibliotheque(InterfaceMoteurBibliotheque interfaceMoteurBibliotheque) {
		this.interfaceMoteurBibliotheque = interfaceMoteurBibliotheque;
	}

}
