package projetthdesgraphes;

public class M1_Graphes {
    int [][] mValeur;
    int [][] mAdjacente;
    int taille;

    public M1_Graphes(int taille) {
        int index = 0;

        this.mValeur = new int[taille][taille];
        for (int[] l : mValeur) {
            index = index + 1;
            for (int c : l) {
                if (c == index) {
                    c = 0;
                } else {
                    c = Integer.MAX_VALUE;
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
