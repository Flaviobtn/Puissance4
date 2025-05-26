import java.util.*;

public class Grille {
    private int longueur;
    private int largeur;

    public Grille(int longueur, int largeur){
        Jeton valeurDefaut = new Jeton("blanc");
        Jeton[][] martice = new Jeton[6][7];
        for(int i = 0; i < matrice.length; i++){
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = valeurDefaut;
            }

        }
    }
}
