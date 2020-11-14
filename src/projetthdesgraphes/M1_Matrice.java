package projetthdesgraphes;

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
        int tailleCase = 0;
        String retourMatrice = "";
        for(int i = 0; i < taille; i++){
            for(int j = 0; j < taille; j++) {
                if(String.valueOf((int)this.matrice[i][j]).length() > tailleCase && this.matrice[i][j]!=Double.POSITIVE_INFINITY)
                    tailleCase = String.valueOf((int)this.matrice[i][j]).length() + 2;
            }
        }
        for (int i = 0; i < this.taille + 1; i++){
            retourMatrice += "\n";
            for (int j =0; j < this.taille + 1;j++){
                if (i == 0 && j ==0) {
                    retourMatrice += " ";
                }
                else if (i == 0) {
                    for (int m = 0; m < tailleCase + 1; m++) {
                        int longueur = String.valueOf(m).length();
                        int debut = (tailleCase - longueur)/2;
                        if (m == debut) {
                            retourMatrice += j-1;
                        }
                        else if (debut < m && m <= longueur + debut ) {

                        }
                        else {
                            retourMatrice += " ";
                        }
                    }
                }
                else if (j == 0) {
                    retourMatrice += i-1;
                }
                else {
                    if(this.matrice[i-1][j-1] == Double.POSITIVE_INFINITY){
                        int debut = (tailleCase - 1)/2;
                        for (int k = 0; k < tailleCase + 1; k++){
                            if (k == debut) {
                                retourMatrice += "∞";
                            }
                            else if (debut < k && k <= debut + 1) {

                            }
                            else {
                                retourMatrice += " ";
                            }
                        }
                    } else{
                        int longueur = String.valueOf((int)(this.matrice[i-1][j-1])).length();
                        int debut = (tailleCase - longueur)/2;
                        for (int l = 0; l < tailleCase + 1; l++) {
                            if (l == debut) {
                                retourMatrice += (int)(this.matrice[i-1][j-1]);
                            }
                            else if (debut < l && l <= longueur + debut ) {

                            }
                            else {
                                retourMatrice += " ";
                            }
                        }
                    }
                }
                retourMatrice += "|";
            }
        }
        return retourMatrice;
    }
}
