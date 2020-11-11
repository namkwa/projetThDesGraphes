package projetthdesgraphes;

import java.util.Arrays;
import java.util.StringJoiner;

public class M1_Graphes {
    int taille;
    int[][] mValeur;
    int[][] mAdjacente;

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
        StringJoiner sj = new StringJoiner(System.lineSeparator());
        for (int[] row : mValeur) {
            sj.add(Arrays.toString(row));
        }
        String result = sj.toString();
        return result;
    }
}
