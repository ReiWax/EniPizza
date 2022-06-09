package fr.eni.bo;

public class Pizza {
	
	private Integer id;
	private String nom;
	private String recette;
	private Double prix;
	
	public Pizza(int id, String nom, String recette, double prix) {
		super();
		this.id = id;
		this.nom = nom;
		this.recette = recette;
		this.prix = prix;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getRecette() {
		return recette;
	}
	
	public void setRecette(String recette) {
		this.recette = recette;
	}
	
	public Double getPrix() {
		return prix;
	}
	
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	@Override
	public String toString() {
		return "Pizza [id=" + id + ", nom=" + nom + ", recette=" + recette + ", prix=" + prix + "]";
	}
	
	

}
