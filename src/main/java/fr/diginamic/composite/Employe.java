package fr.diginamic.composite;

public class Employe implements IElement {
    private String nom;
    private double salaire;

    public Employe(String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    @Override
    public double calculerSalaire() {
        return salaire;
    }

}
