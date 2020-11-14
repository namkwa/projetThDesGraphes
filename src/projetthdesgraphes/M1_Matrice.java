package projetthdesgraphes;

import java.util.Arrays;

public class M1_Matrice {
    double[][] matrice;
    private final int taille;

    public M1_Matrice(double[][] matrice,int taille) {
        this.matrice = matrice;
        this.taille = taille;
    }
    public M1_Matrice(int taille){
        this.matrice = new double[taille][taille];
        this.taille = taille;
    }

    public double[][] getMatrice() {
        return matrice;
    }

    public int getTaille() {
        return taille;
    }

     public double getValeur(int ligne,int colonne) {
        return matrice[ligne][colonne];
     }

     public void setValeur(double valeur, int ligne, int colonne) {
        this.matrice[ligne][colonne] = valeur;
     }

    @Override
    public String toString() {
        String retourMatrice = "";
        for (int i = 0; i < this.taille; i++){
            retourMatrice += "\n";
            for (int j =0; j < this.taille;j++){
                if(this.matrice[i][j] == Double.POSITIVE_INFINITY){
                    retourMatrice += "∞  ";
                }else{
                    retourMatrice += this.matrice[i][j] + "  ";
                }
            }
        }
        return retourMatrice;
    }
}
