package sn.ucad.retel1jour.hannatmane.interfaces;

import java.util.ArrayList;
import java.util.List;
import sn.ucad.retel1jour.hannatmane.be.BonPilotage;
import sn.ucad.retel1jour.hannatmane.be.Escales;
import sn.ucad.retel1jour.hannatmane.be.Navire;



public class CalculerPrestationIMP implements ICalculerPrestation {
	// cette classe respecte le contrat de l'interface
	// C'est la classe qui implemente l'interface avec le mot cle impléments
	/*
	 * La classe CalculerPrestation implémente l'interface ICalculerPrestation. Cela
	 * signifie qu'elle donne le code concret pour toutes les méthodes définies dans
	 * l'interface.
	 */

	 // Attributs selon la consigne (Question 3)
    private Navire navire;
    private Escales escales;
    private BonPilotage bonPilotage;
    private List<BonPilotage> mesBons = new ArrayList<>();
    
    
	public CalculerPrestationIMP() {
		super();
		
	}
	
	public CalculerPrestationIMP(Navire navire, Escales escales, BonPilotage bonPilotage, List<BonPilotage> mesBons) {
		super();
		this.navire = navire;
		this.escales = escales;
		this.bonPilotage = bonPilotage;
		this.mesBons = mesBons;
	}

	@Override
	public double calculerMontantBon(double prixTypeMouvement, double volumeNavire, double tirantEau) {
		// TODO Auto-generated method stub
		return prixTypeMouvement * volumeNavire * tirantEau;
	}
	@Override
	public double calculerMontantSejour(int nombreJours, double prixSejour, double volumeNavire) {
		// TODO Auto-generated method stub
		return nombreJours * prixSejour * volumeNavire;
	}
	@Override
	public List<BonPilotage> creerListeBons() {
		
		return mesBons;
		
		
	}
	public Navire getNavire() {
		return navire;
	}
	public void setNavire(Navire navire) {
		this.navire = navire;
	}
	public Escales getEscales() {
		return escales;
	}
	public void setEscales(Escales escales) {
		this.escales = escales;
	}
	public BonPilotage getBonPilotage() {
		return bonPilotage;
	}
	public void setBonPilotage(BonPilotage bonPilotage) {
		this.bonPilotage = bonPilotage;
	}
	public List<BonPilotage> getMesBons() {
		return mesBons;
	}
	public void setMesBons(List<BonPilotage> mesBons) {
		this.mesBons = mesBons;
	}
	public List<BonPilotage> calculerMontantTotal() {
        return mesBons;
    }
    
   
    }
    
   
	

