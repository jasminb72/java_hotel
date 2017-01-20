/**
 * 
 */
package fr.imie;

/**
 * @author imiedev
 *
 */
public class Livre {

	private int esbn;
	private String nom;
	private String auteur;

	/**
	 * 
	 */
	public Livre(String nom) {
		this.nom = nom;
	}

	public int getEsbn() {
		return esbn;
	}

	public void setEsbn(int esbn) {
		this.esbn = esbn;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

}
