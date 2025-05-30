package sn.ucad.retel1jour.hannatmane.be;

import java.util.Date;

public class BonPilotage {
	private int idMouvement;
	private Escales monEscale;
	private Date datedeBon;
	private String posteaquai;

	public BonPilotage() {
		super();
	}

	public BonPilotage(int idMouvement, Escales monEscale, Date datedeBon, String posteaquai) {
		super();
		this.idMouvement = idMouvement;
		this.monEscale = monEscale;
		this.datedeBon = datedeBon;
		this.posteaquai = posteaquai;
	}

	public int getIdMouvement() {
		return idMouvement;
	}

	public void setIdMouvement(int idMouvement) {
		this.idMouvement = idMouvement;
	}

	public Escales getMonEscale() {
		return monEscale;
	}

	public void setMonEscale(Escales monEscale) {
		this.monEscale = monEscale;
	}

	public Date getDatedeBon() {
		return datedeBon;
	}

	public void setDatedeBon(Date datedeBon) {
		this.datedeBon = datedeBon;
	}

	public String getPosteaquai() {
		return posteaquai;
	}

	public void setPosteaquai(String posteaquai) {
		this.posteaquai = posteaquai;
	}

}
