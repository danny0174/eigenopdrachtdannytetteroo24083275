package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersoonTest {

    @Test
    public void testGezinslidEetMeeOpDinsdag() {
        Gezinslid g = new Gezinslid("Jasper");
        g.voegEetDagenToe("dinsdag,woensdag");
        assertTrue(g.eetMee("dinsdag"));
    }

    @Test
    public void testGastEetNietMeeOpVrijdag() {
        Gast gast = new Gast("Anna");
        gast.voegEetDagenToe("maandag,dinsdag");
        assertFalse(gast.eetMee("vrijdag"));
    }

    @Test
    public void testGastEetElkeDagMeeAlsInputLeegIs() {
        Gast gast = new Gast("Ruben");
        gast.voegEetDagenToe("");
        assertTrue(gast.eetMee("zondag"));
    }
}
