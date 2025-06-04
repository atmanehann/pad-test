package sn.ucad.retel1jour.hannatmane.test;

import sn.ucad.retel1jour.hannatmane.be.*;
import java.time.LocalDate;
import java.time.ZoneId;
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
		
	        
		double prixParJour = 10;
		long nbJours = un_escale.calculerNombreJours();
        double volume = mon_navire.getVolume();
        double montantSejour = nbJours * prixParJour * volume;
        
	        

		System.out.println("Le navire de nom : " + mon_navire.getNom() + ", longueur : " + mon_navire.getLongueur()
				+ ", largeur : " + mon_navire.getLargeur() + ", volume : " + mon_navire.getVolume()
				+ ", et tirant d'eau : " + mon_navire.getTirantEau());
		
		//Le montant du séjour est égale à nombre de jour * prix séjour * volume navire 
		//System.out.println("Nombre de jours de séjour : " + nbJours);
        System.out.println("doit payer pour le séjour : " + montantSejour + " CFA.");
        
        
		
	}
}   
       
    
		

	
