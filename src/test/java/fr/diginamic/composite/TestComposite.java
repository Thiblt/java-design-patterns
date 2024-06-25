package fr.diginamic.composite;

public class TestComposite {

    public static void main(String[] args) {
        Employe employe1 = new Employe("Cecile RASPEY", 10000);
        Employe employe2 = new Employe("Bilel BECKAR", 8000);
        Employe employe3 = new Employe("JB RANMEY", 7500);
        Employe employe4 = new Employe("Jane DOE", 3500);
        Employe employe5 = new Employe("Kevin GUINEAU", 7500);
        Employe employe6 = new Employe("Paul MARTIN", 3500);

        Service Dsin = new Service("DSIN");
        Service BigData = new Service("Big Data");
        Service JavaDev = new Service("Java Dev");

        Dsin.ajouterElement(employe1);
        Dsin.ajouterElement(employe2);

        BigData.ajouterElement(employe3);
        BigData.ajouterElement(employe4);

        JavaDev.ajouterElement(employe5);
        JavaDev.ajouterElement(employe6);

       
        Dsin.ajouterElement(BigData);
        Dsin.ajouterElement(JavaDev);

        System.out.println("Salaire total du Dsin: " + Dsin.calculerSalaire());
        System.out.println("Salaire total du Service Big Data: " + BigData.calculerSalaire());
        System.out.println("Salaire total du Service JavaDev: " + JavaDev.calculerSalaire());
    }
}