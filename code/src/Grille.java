import java.util.*;

public class Grille {
    private int hauteur = 6;
    private int largeur = 7;
    private Jeton[][] matrice;

    public Grille(){
        this.matrice = new Jeton[this.largeur][this.hauteur];
        for(int i = 0; i < this.largeur; i++){
            for (int j = 0; j < this.hauteur; j++){
                Jeton valeurDefaut = new Jeton();
                this.matrice[i][j] = valeurDefaut;
            }
        }
    }

    public Jeton[][] getMatrice(){
        return this.matrice;
    }

    public int getHauteur(){
        return this.hauteur;
    }

    public int getLargeur(){
        return this.largeur;
    }

    public List<Jeton> getColonne(int numColonne){
        List<Jeton> colonne = new ArrayList<>();
        for(int i = 0; i < this.largeur; i++){
            if(i == numColonne){
                for(int j = 0; j < this.hauteur; j++){
                    colonne.add(this.matrice[i][j]);
                }
            }
        }
        return colonne;
    }

    public List<Jeton> getLigne(int numColonne){
        List<Jeton> colonne = new ArrayList<>();
        for(int i = 0; i < this.largeur; i++){
            if(i == numColonne){
                for(int j = 0; j < this.hauteur; j++){
                    colonne.add(this.matrice[i][j]);
                }
            }
        }
        return colonne;
    }
}
