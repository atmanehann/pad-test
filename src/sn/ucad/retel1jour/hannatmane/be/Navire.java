package sn.ucad.retel1jour.hannatmane.be;

public class Navire {
	private String numero;
    private String nom;
    private double longueur;
    private double largeur;
    private int volume;
    private double tirantEau;
	
    public Navire() {
		super();
	}

	public Navire(String numero, String nom, double longueur, double largeur, int volume, double tirantEau) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.longueur = longueur;
		this.largeur = largeur;
		this.volume = volume;
		this.tirantEau = tirantEau;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public double getTirantEau() {
		return tirantEau;
	}

	public void setTirantEau(double tirantEau) {
		this.tirantEau = tirantEau;
	}
	
    
    
    

}
