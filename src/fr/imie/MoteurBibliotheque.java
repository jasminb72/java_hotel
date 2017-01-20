package fr.imie;

import java.util.Date;
import java.util.List;

public class MoteurBibliotheque implements InterfaceMoteurBibliotheque {

	private String nomBibliotheque;

	public MoteurBibliotheque() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean demanderReservationLivre(Livre livre, Date dateReservation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean validerReservationLivre(Livre livre, Adherent adherent, Date dateReservation) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNomBibliotheque() {
		return nomBibliotheque;
	}

	public void setNomBibliotheque(String nomBibliotheque) {
		this.nomBibliotheque = nomBibliotheque;
	}

	@Override
	public List<Livre> listerTousLivres() {
		// TODO Auto-generated method stub
		return null;
	}

}
