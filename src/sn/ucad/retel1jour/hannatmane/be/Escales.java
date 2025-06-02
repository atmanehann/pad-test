package sn.ucad.retel1jour.hannatmane.be;

import java.util.Date;

public class Escales {
	private String codeEscale;
	private String numEscale;
	private Date debutEscale;
	private Date finEscale;
	private Navire myNavire;
	private long prixSejour;

	public Escales() {
		super();
	}

	public Escales(String codeEscale, String numEscale, Date debutEscale, Date finEscale, Navire myNavire,
			long prixSejour) {
		super();
		this.codeEscale = codeEscale;
		this.numEscale = numEscale;
		this.debutEscale = debutEscale;
		this.finEscale = finEscale;
		this.myNavire = myNavire;
		this.prixSejour = prixSejour;
	}
	
	

	public Escales(String numEscale, Date debutEscale, Date finEscale, long prixSejour) {
		super();
		this.numEscale = numEscale;
		this.debutEscale = debutEscale;
		this.finEscale = finEscale;
		this.prixSejour = prixSejour;
	}

	public String getCodeEscale() {
		return codeEscale;
	}

	public void setCodeEscale(String codeEscale) {
		this.codeEscale = codeEscale;
	}

	public String getNumEscale() {
		return numEscale;
	}

	public void setNumEscale(String numEscale) {
		this.numEscale = numEscale;
	}

	public Date getDebutEscale() {
		return debutEscale;
	}

	public void setDebutEscale(Date debutEscale) {
		this.debutEscale = debutEscale;
	}

	public Date getFinEscale() {
		return finEscale;
	}

	public void setFinEscale(Date finEscale) {
		this.finEscale = finEscale;
	}

	public Navire getMyNavire() {
		return myNavire;
	}

	public void setMyNavire(Navire myNavire) {
		this.myNavire = myNavire;
	}

	public long getPrixSejour() {
		return prixSejour;
	}

	public void setPrixSejour(long prixSejour) {
		this.prixSejour = prixSejour;
	}

	 // Méthode pour calculer le nombre de jours (selon la formule donnée)
    public long calculerNombreJours() {
        long CONST_DURATION_OF_DAY = 1000 * 60 * 60 * 24;
        long diff = Math.abs(finEscale.getTime() - debutEscale.getTime());
        long numberOfDay = diff / CONST_DURATION_OF_DAY + 1;
        return numberOfDay;
    }
}
