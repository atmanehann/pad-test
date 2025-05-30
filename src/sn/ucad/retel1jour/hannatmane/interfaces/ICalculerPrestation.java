package sn.ucad.retel1jour.hannatmane.interfaces;

import java.util.List;
import sn.ucad.retel1jour.hannatmane.be.BonPilotage;

public interface ICalculerPrestation {
	// interface = mot-clé pour créer une interface
	// ICalculerPrestation = nom de l'interface (le "I" au début indique que c'est
	// une interface)
	// Attributs de la classe

	// 4.1 - Calcul du montant d'un bon
	public double calculerMontantBon(double prixTypeMouvement, double volumeNavire, double tirantEau);

	// 4.2 - Calcul du montant du séjour
	public double calculerMontantSejour(int nombreJours, double prixSejour, double volumeNavire);

	// 4.3 - Créer la liste des bons (Entrée, Mouvement, Sortie)
	List<BonPilotage> creerListeBons();

}
