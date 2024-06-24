package fr.diginamic.factory;

public class ElementFactory {

	public static Element createElement(ElementType type, String nom, double valeur, Unit unite) {
        switch (type) {
            case INGREDIENT:
                return new Ingredient(nom, valeur, unite);
            case ALLERGENE:
                return new Allergene(nom, valeur, unite);
            case ADDITIF:
                return new Additif(nom, valeur, unite);
            default:
                throw new IllegalArgumentException("Unknown element type: " + type);
        }
    }
}
