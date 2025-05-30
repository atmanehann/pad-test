package sn.ucad.retel1jour.hannatmane.test;

import java.util.List;

import sn.ucad.retel1jour.hannatmane.be.*;
import sn.ucad.retel1jour.hannatmane.interfaces.*;


public class TestPrestation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Création d'une instance de CalculerPrestation
		 CalculerPrestationIMP calculer;
         calculer = new CalculerPrestationIMP();

		// Récupération des objets instanciés
		Navire navire = calculer.getNavire();
		Escales escale = calculer.getEscales();
		List<BonPilotage> mesBons = calculer.getMesBons();

		afficherFacture(navire, escale, mesBons);
	}

	private static void afficherFacture(Navire navire, Escales escale,List<BonPilotage> mesBons) {
		// Calcul du total des bons de pilotage
		double totalBons = 0;
		for (BonPilotage bon : mesBons) {
			totalBons += bon.getIdMouvement();
		}

		// Calcul du total général
		double totalGeneral = escale.getPrixSejour() + totalBons;

		// Affichage formaté
		System.out.println("Le navire de nom : " + navire.getNom() + ", longueur : " + navire.getLongueur()
				+ ", largeur :" + navire.getLargeur() + ", volume :" + navire.getVolume() + " et tirant d'eau :"
				+ navire.getTirantEau());

		System.out.println("Le prix de la prestation de sejour " + (int) totalBons + " CFA et pour les bons "
				+ (int) totalBons + " CFA.");

		System.out.println("Le montant total de la prestation s'élève donc a " + (int) totalGeneral + " CFA");

		System.out.println("pour l'escale numero : " + escale.getNumEscale());

		System.out.println("................................................................");
	}

}
