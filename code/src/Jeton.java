import java.util.*;

public class Jeton{
    private String couleur;
    private Integer x;
    private Integer y;

    public Jeton(){
        this.couleur = "blanc";
        this.x = null;
        this.y = null;
    }

    public Jeton(String couleur){
        this.couleur = couleur;
        this.x = null;
        this.y = null;
    }

    public String getCouleur(){
        return this.couleur;
    }

    public int getX(){
        return this.x;
    }

    public int gety(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
}