package fr.diginamic.factory;


import static org.junit.Assert.*;
import org.junit.Test;

public class ElementFactoryTest {

    @Test
    public void testCreateIngredient() {
        Element ingredient = ElementFactory.createElement(ElementType.INGREDIENT, "Tomate", 150.0, Unit.MICRO_GRAMMES);
        assertNotNull(ingredient);
        assertTrue(ingredient instanceof Ingredient);
        assertEquals("Tomate", ingredient.getNom());
        assertEquals(150.0, ingredient.getValeur(), 0.1);
        assertEquals(Unit.MICRO_GRAMMES, ingredient.getUnite());
    }

    @Test
    public void testCreateAllergene() {
        Element allergene = ElementFactory.createElement(ElementType.ALLERGENE, "Gluten", 10.0, Unit.MILI_GRAMMES);
        assertNotNull(allergene);
        assertTrue(allergene instanceof Allergene);
        assertEquals("Gluten", allergene.getNom());
        assertEquals(10.0, allergene.getValeur(), 0.1);
        assertEquals(Unit.MILI_GRAMMES, allergene.getUnite());
    }

    @Test
    public void testCreateAdditif() {
        Element additif = ElementFactory.createElement(ElementType.ADDITIF, "E200", 5.0, Unit.MILI_GRAMMES);
        assertNotNull(additif);
        assertTrue(additif instanceof Additif);
        assertEquals("E200", additif.getNom());
        assertEquals(5.0, additif.getValeur(), 0.1);
        assertEquals(Unit.MILI_GRAMMES, additif.getUnite());
    }
}
