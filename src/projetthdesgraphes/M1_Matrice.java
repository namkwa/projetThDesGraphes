package projetthdesgraphes;

import java.util.Arrays;

public class M1_Matrice {
    int[][] matrice;
    private final int taille;
    public M1_Matrice(int[][] matrice,int taille) {
        this.matrice = matrice;
        this.taille = taille;
    }

    public int getTaille() {
        return taille;
    }
     public int getValeur(int ligne,int colonne) {
        return matrice[ligne][colonne];
     }
     public void setValeur(int valeur, int ligne, int colonne) {
        this.matrice[ligne][colonne] = valeur;
     }

    @Override
    public String toString() {
        String retourMatrice = "";
        for (int i = 0; i < this.taille-1; i++){
            retourMatrice += "\n";
            for (int j =0; j < this.taille-1;j++){
                if(this.matrice[i][j]==Integer.MAX_VALUE){
                    retourMatrice += "∞  ";
                }else{
                    retourMatrice += this.matrice[i][j] + "  ";
                }
            }
        }
        return retourMatrice;
    }
}
