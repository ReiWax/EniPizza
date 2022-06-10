package fr.eni.pizza.bo;

public class Pizza {
	private Integer id;
	private String libelle;
	private String description;
	private Integer prix;
	
	public Pizza() {
		super();
	}
	
	public Pizza(Integer id, String libelle, String description, Integer prix) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description = description;
		this.prix = prix;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPrix() {
		return prix;
	}
	public void setPrix(Integer prix) {
		this.prix = prix;
	}
	public Pizza(String libelle, String description, Integer prix) {
		super();
		this.libelle = libelle;
		this.description = description;
		this.prix = prix;
	}
	
}
