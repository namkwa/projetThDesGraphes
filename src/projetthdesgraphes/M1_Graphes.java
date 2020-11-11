package projetthdesgraphes;

public class M1_Graphes {
    int [][] mValeur;
    int [][] mAdjacente;
    int taille;

    public M1_Graphes(int taille) {
        this.taille=taille;
        this.mValeur = new int[taille][taille];
        this.mAdjacente = new int[taille][taille];

        int indexL = -1;
        int indexC = -1;
        int infinie= Integer.MAX_VALUE;

        for (int[] l : mValeur) {
            indexL = indexL + 1;
            for (int c : l) {
                indexC=indexC+1;
                if (indexC == indexL) {
                    c = 0;
                } else {
                    c = infinie;
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
            for (int j =0; j < this.taille;i++){
                retourValeur += mValeur[i][j] + "  ";
                retourAdjacente += mAdjacente[i][j] + "  ";
            }
        }
        return retourAdjacente + "\n" + retourValeur;
    }
}
