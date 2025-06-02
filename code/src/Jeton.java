import java.util.*;

public class Jeton{
    private String couleur;
    private Grille grille;

    public Jeton(){
        this.couleur = "blanc";
    }

    public Jeton(String couleur){
        this.couleur = couleur;
    }

    public String getCouleur(){
        return this.couleur;
    }

    public void setCouleur(String couleur){
        this.couleur = couleur;
    }

    public void placerJetons(Grille grille, int colonne){
        try{
            this.modifJeton(colonne, couleur);
            System.out.println("Jeton placé dans la colonne " + colonne);
        } 
        catch (PlusDePlaceException e) {
            System.err.println(e.getMessage());
        }
    }

    private void modifJeton(int colonne,String couleur) throws PlusDePlaceException{
        List<Jeton> colonnespec = this.grille.getColonne(colonne);

        if(!(colonnespec.get(colonnespec.size()-1).getCouleur().equals("blanc"))){
            throw new PlusDePlaceException();
        }

        for(Jeton jeton : colonnespec){
            if(jeton.getCouleur().equals("blanc")){
                jeton.setCouleur(this.couleur);
                break;
            }
        }
    }
}