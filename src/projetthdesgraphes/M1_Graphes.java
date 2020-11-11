package projetthdesgraphes;

public class M1_Graphes {
    int [][] mValeur;
    int [][] mAdjacente;
    int taille;

    public M1_Graphes(int taille) {
        int index=0;

        this.mValeur = new int [taille] [taille];
        for (int[] l: mValeur){
            index=index+1;
            for (int c: l) {
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
        String retour = "";
        for (int i = 0; mValeur.length()>i ;i++){

        }
    }
}
