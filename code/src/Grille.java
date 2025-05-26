import java.util.*;

public class Grille {
    private int hauteur = 6;
    private int largeur = 7;

    public Grille(){
        Jeton[][] matrice = new Jeton[this.hauteur][this.largeur];
        for(int i = 0; i < this.hauteur; i++){
            for (int j = 0; j < this.largeur; j++){
                Jeton valeurDefaut = new Jeton();
                matrice[i][j] = valeurDefaut;
            }
        }
    }

    public boolean placerJeton(int colonne){
         
    }


}
