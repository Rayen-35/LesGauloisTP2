package personnages;

public abstract class Personnage {
    protected String nom;
    protected int force;

    public Personnage(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    protected abstract String donnerAuteur();

    public void parler(String texte) {
        System.out.println(donnerAuteur() + nom + " : << " + texte + " >>");
    }

    public void frapper(Personnage adversaire) {
        System.out.println(donnerAuteur() + nom + " envoie un grand coup dans la mâchoire de " + adversaire.getNom());
        adversaire.recevoirCoup(force / 3);
    }

    public void recevoirCoup(int forceCoup) {
        force -= forceCoup;
        if (force <= 0) {
            force = 0;
            parler("J’abandonne...");
        } else {
            parler("Aïe !");
        }
    }
}
