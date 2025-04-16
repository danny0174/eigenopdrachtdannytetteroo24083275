package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MaaltijdOverzichtTest {

    @Test
    public void testGastEetMeeOpMaandag() {
        // Hier heb ik Arrange
        Gast gast = new Gast("Lotte");
        gast.voegEetDagenToe("maandag,dinsdag");

        // Hier heb ik Act
        boolean eetMee = gast.eetMee("maandag");

        // Hier heb ik Assert
        assertTrue(eetMee, "Gast Lotte zou op maandag moeten mee-eten.");
    }

    @Test
    public void testGezinslidEetNietMeeOpZaterdag() {
        // Arrange
        Gezinslid lid = new Gezinslid("Jan");
        lid.voegEetDagenToe("maandag,dinsdag,woensdag");

        // Act
        boolean eetMee = lid.eetMee("zaterdag");

        // Assert
        assertFalse(eetMee, "Gezinslid Jan zou op zaterdag niet mee moeten eten.");
    }
    @Test
    public void testGastEetAlleDagenMeeAlsGeenEetDagen() {
        // Arrange
        Gast gast1 = new Gast("Lotte");
        gast1.voegEetDagenToe("");
        // Act en Assert
        assertTrue(gast1.eetMee("maandag"), "Gast Lotte zou op maandag moeten mee-eten.");
        assertTrue(gast1.eetMee("dinsdag"), "Gast Lotte zou op dinsdag moeten mee-eten.");
        assertTrue(gast1.eetMee("woensdag"), "Gast Lotte zou op woensdag moeten mee-eten.");
        assertTrue(gast1.eetMee("donderdag"), "Gast Lotte zou op donderdag moeten mee-eten.");
        assertTrue(gast1.eetMee("vrijdag"), "Gast Lotte zou op vrijdag moeten mee-eten.");
        assertTrue(gast1.eetMee("zaterdag"), "Gast Lotte zou op zaterdag moeten mee-eten.");
        assertTrue(gast1.eetMee("zondag"), "Gast Lotte zou op zondag moeten mee-eten.");
    }
}
