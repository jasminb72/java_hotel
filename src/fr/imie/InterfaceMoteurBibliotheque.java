/**
 * 
 */
package fr.imie;

import java.util.Date;
import java.util.List;

/**
 * @author imiedev
 *
 */
public interface InterfaceMoteurBibliotheque {

	public Boolean demanderReservationLivre(Livre livre, Date dateReservation);
	
	public Boolean validerReservationLivre(Livre livre, Adherent adherent, Date dateReservation );
	
	public  List<Livre> listerTousLivres();
	
}
