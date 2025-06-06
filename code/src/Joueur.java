import java.util.*;

public class Joueur {
    private String pseudo;
    private String couleur;

    public Joueur(String pseudo, String couleur) {
        this.pseudo = pseudo;
        this.couleur = couleur;
    }

    public String getPseudo() {
        return pseudo;
    }
    public String getCouleur() {
        return couleur;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    @Override
    public String toString() {
        return "Joueur{" + "pseudo= " + pseudo + ", couleur= " + couleur + '}';
    }
}