package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 8);
        Romain minus = new Romain("Minus", 6);

        // Test de la méthode parler
        asterix.parler("Bonjour à tous");
        minus.parler("UN GAU... UN GAUGAU...");

        // Astérix frappe Minus trois fois
        for (int i = 0; i < 3; i++) {
            asterix.frapper(minus);
        }
    }
}
