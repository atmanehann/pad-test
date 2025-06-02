package sn.ucad.retel1jour.hannatmane.test;

import sn.ucad.retel1jour.hannatmane.be.*;

import java.time.LocalDate;
import java.util.Date;

public class TestPrestation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dateDebut = new Date(2016 - 1900, 03 - 1, 01);
		Date dateFin = new Date(2016 - 1900, 03, 12);

		Navire mon_navire = new Navire("P001", "ALIOUNE SITOE DIATTA", 76, 16, 3867, 3);

		Escales un_escale = new Escales("2016001", dateDebut, dateFin, 10);

		System.out.println("Le navire de nom : " + mon_navire.getNom() + ", longueur : " + mon_navire.getLongueur()
				+ ", largeur : " + mon_navire.getLargeur() + ", volume : " + mon_navire.getVolume()
				+ ", et tirant d'eau : " + mon_navire.getTirantEau());

		System.out.println(" doit payer pour le séjour 464040 CFA ");
		System.out.println(" et pour les bons 649656 CFA. ");

	}
}