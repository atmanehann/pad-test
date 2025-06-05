package sn.ucad.retel1jour.hannatmane.test;

import sn.ucad.retel1jour.hannatmane.be.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class TestPrestation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localDateDebut = LocalDate.of(2016, 3, 1);
		LocalDate localDateFin = LocalDate.of(2016, 3, 12);

		Date dateDebut = Date.from(localDateDebut.atStartOfDay(ZoneId.systemDefault()).toInstant());
		Date dateFin = Date.from(localDateFin.atStartOfDay(ZoneId.systemDefault()).toInstant());

		Navire mon_navire = new Navire("P001", "ALIOUNE SITOE DIATTA", 76, 16, 3867, 3);

		Escales un_escale = new Escales("2016001", dateDebut, dateFin, 10);
		
		 ArrayList<TypeMouvement> ListeBons = new ArrayList<>();
		TypeMouvement typemouvement1 = new TypeMouvement("E", "entrée au port", "101", 5);
		TypeMouvement typemouvement2 = new TypeMouvement("M", "mouvement", "102", 15);
		TypeMouvement typemouvement3 = new TypeMouvement("S", "sortie du port", "103", 8);
		
		ListeBons.add(typemouvement1);
		ListeBons.add(typemouvement2);
		ListeBons.add(typemouvement3);
		

		double prixParJour = 10;
		long nbJours = un_escale.calculerNombreJours();
		double volume = mon_navire.getVolume();
		double montantSejour = nbJours * prixParJour * volume;
		double prixTypeMvt1 = 5;
		double prixTypeMvt2 = 15;
		double prixTypeMvt3 = 8;
		double tirantEau = mon_navire.getTirantEau();
		double montantBon1 = prixTypeMvt1 * volume * tirantEau;
		double montantBon2 = prixTypeMvt2 * volume * tirantEau;
		double montantBon3 = prixTypeMvt3 * volume * tirantEau;
		double montantTotalBons = montantBon1 + montantBon2 + montantBon3;

		System.out.print("et pour les bons : " + montantTotalBons + " CFA ");

		System.out.println("Le navire de nom : " + mon_navire.getNom() + ", longueur : " + mon_navire.getLongueur()
				+ ", largeur : " + mon_navire.getLargeur() + ", volume : " + mon_navire.getVolume()
				+ ", et tirant d'eau : " + mon_navire.getTirantEau());

		// Le montant du séjour est égale à nombre de jour * prix séjour * volume navire
		// System.out.println("Nombre de jours de séjour : " + nbJours);
		System.out.print("doit payer pour le séjour : " + montantSejour + " CFA ");
//		System.out.print("pour le bon d'entrée : " + montantBon1 + " CFA ");
//		System.out.print("pour le bon des mouvements effectuées dans le port : " + montantBon2 + " CFA ");
//		System.out.print("pour le bon de sortie : " + montantBon3 + " CFA ");
		System.out.print("et pour les bons : " + montantTotalBons + " CFA .");

	}

	public TestPrestation() {
		super();
	}
}
