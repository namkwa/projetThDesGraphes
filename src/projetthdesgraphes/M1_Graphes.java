package projetthdesgraphes;

public class M1_Graphes {
    M1_Matrice mValeur;
    M1_Matrice mAdjacente;

    public M1_Graphes(int taille) {
        this.taille=taille;
        this.mValeur.getTaille() = new int[taille][taille];
        this.mAdjacente.getTaille() = new int[taille][taille];

        for (int i = 0; i < this.taille-1 ;i++){
            for (int j =0; j < this.taille-1;j++) {
                if (i == j) {
                    this.mValeur[i][j] = 0;
                    this.mAdjacente[i][j] = 0;
                } else {
                    this.mValeur = Integer.MAX_VALUE;
                    this.mAdjacente[i][j] = Integer.MAX_VALUE;
                }
            }
        }
    }
    public void floyd_Marshall(){
        int taille = this.mValeur.getTaille();
        for ( int k = 0; k < taille; k++){
            for (int i = 0; i < taille; i++) {
                for (int j = 0; j < taille; j++) {
                    this.mValeur.setValeur(Math.min(this.mValeur.getValeur(i,j), this.mValeur.getValeur(i,k) + this.mValeur.getValeur(k,j)),i,j);
                }
            }
            System.out.println(this.mValeur);
        }

    }

    @Override
    public String toString() {
        return"mValeur" + this.mValeur.toString() + "\nmAdjacente" + this.mAdjacente.toString();


    }
}
