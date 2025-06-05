package sn.ucad.retel1jour.hannatmane.be;

public class TypeMouvement extends BonPilotage {
	private String codeTypeMvt;
	private String libelleTypeMvt;
	private Long prixTypeMvt;

	public TypeMouvement() {
		super();

	}

	public TypeMouvement(String codeTypeMvt, String libelleTypeMvt, Long prixTypeMvt) {
		super();
		this.codeTypeMvt = codeTypeMvt;
		this.libelleTypeMvt = libelleTypeMvt;
		this.prixTypeMvt = prixTypeMvt;
	}

	public TypeMouvement(String codeTypeMvt, String libelleTypeMvt, String posteAQuai, long prixTypeMvt) {
        super(posteAQuai);  
        this.codeTypeMvt = codeTypeMvt;
        this.libelleTypeMvt = libelleTypeMvt;
        this.prixTypeMvt = prixTypeMvt;
    }
	
	public double calculerMontantBon(double prixTypeMvt, double volumeNavire, double tirantEau) {
        return prixTypeMvt * volumeNavire * tirantEau;
	}

	public String getCodeTypeMvt() {
		return codeTypeMvt;
	}

	public void setCodeTypeMvt(String codeTypeMvt) {
		this.codeTypeMvt = codeTypeMvt;
	}

	public String getLibelleTypeMvt() {
		return libelleTypeMvt;
	}

	public void setLibelleTypeMvt(String libelleTypeMvt) {
		this.libelleTypeMvt = libelleTypeMvt;
	}

	public Long getPrixTypeMvt() {
		return prixTypeMvt;
	}

	public void setPrixTypeMvt(Long prixTypeMvt) {
		this.prixTypeMvt = prixTypeMvt;
	}

}
