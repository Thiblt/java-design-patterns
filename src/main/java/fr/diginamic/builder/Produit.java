package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.factory.Additif;
import fr.diginamic.factory.Allergene;
import fr.diginamic.factory.Ingredient;

public class Produit {
	private String nom;
	private String garde;
	private Categorie categorie;
	private Marque marque;
	private List<Ingredient> ingredients= new ArrayList<Ingredient>();
	private List<Additif> additifs= new ArrayList<Additif>();
	private List<Allergene> allergenes= new ArrayList<Allergene>();
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getGarde() {
		return garde;
	}
	public void setGarde(String garde) {
		this.garde = garde;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	public List<Additif> getAdditifs() {
		return additifs;
	}
	public void setAdditifs(List<Additif> additifs) {
		this.additifs = additifs;
	}
	public List<Allergene> getAllergenes() {
		return allergenes;
	}
	public void setAllergenes(List<Allergene> allergenes) {
		this.allergenes = allergenes;
	}
	
	
	

}
