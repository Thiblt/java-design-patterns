package fr.diginamic.builder;

import java.util.List;

import fr.diginamic.factory.Additif;
import fr.diginamic.factory.Allergene;
import fr.diginamic.factory.Ingredient;

public class ProduitBuilder {
	private Produit produit;
	
	public ProduitBuilder() {
		this.produit=new Produit();
	}
	public ProduitBuilder appendIngredient(List<Ingredient> ingredients) {
		produit.setIngredients(ingredients);
		return this;
	};
	public ProduitBuilder appendAllergene(List<Allergene> allergenes) {
		produit.setAllergenes(allergenes);
		return this;
	};
public ProduitBuilder appendAdditif(List<Additif> additifs) {
		produit.setAdditifs(additifs);
		return this;
	};
	
	public ProduitBuilder appendMarque(String nom) {
		Marque marque= new Marque(nom);
		produit.setMarque(marque);
		return this;
	};
	
	public ProduitBuilder appendCategorie(String nom) {
		Categorie categorie= new Categorie(nom);
		produit.setCategorie(categorie);
		return this;
	};
	public Produit Assemble() {
		
		return produit;
	};

}
