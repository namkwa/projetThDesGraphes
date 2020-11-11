package projetthdesgraphes;

public class M1_Graphes {
    int [][] mValeur;
    int [][] mAdjacente;
    int taille;

    public M1_Graphes(int taille) {
        this.taille=taille;
        this.mValeur = new int[taille][taille];
        this.mAdjacente = new int[taille][taille];

        for (int i = 0; i < this.taille ;i++){
            for (int j =0; j < this.taille;j++) {
                if (i == j) {
                    this.mValeur[i][j] = 0;
                    this.mAdjacente[i][j] = 0;
                } else {
                    this.mValeur[i][j] = Integer.MAX_VALUE;
                    this.mAdjacente[i][j] = Integer.MAX_VALUE;
                }
            }
        }
    }

    @Override
    public String toString() {
        String retourValeur = "mValeur";
        String retourAdjacente = "mAdjacente";
        for (int i = 0; i < this.taille ;i++){
            retourAdjacente += "\n";
            retourValeur += "\n";
            for (int j =0; j < this.taille;j++){
                if(mValeur[i][j]==Integer.MAX_VALUE){
                    retourValeur += "∞  ";
                }else{
                    retourValeur += mValeur[i][j] + "  ";
                }
                if(mValeur[i][j]==Integer.MAX_VALUE){
                    retourAdjacente += "∞  ";
                }else{
                    retourAdjacente += mAdjacente[i][j] + "  ";
                }
            }
        }
        return retourAdjacente + "\n" + retourValeur;
    }
}
