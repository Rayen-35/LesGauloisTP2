package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 9);
        Romain minus = new Romain("Minus", 6);

        asterix.parler("Bonjour à tous");
        minus.parler("UN GAU... UN GAUGAU...");

        // Combats
        asterix.frapper(minus);
        minus.frapper(asterix);

        asterix.frapper(minus);
        minus.frapper(asterix);

        asterix.frapper(minus);
    }
}
