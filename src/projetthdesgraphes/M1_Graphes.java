package projetthdesgraphes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class M1_Graphes {
    M1_Matrice mValeur;
    M1_Matrice mAdjacente;

    public M1_Graphes(Scanner scan) {
        //on créé la matrice adjacente
        String line = scan.nextLine();
        this.mAdjacente = new M1_Matrice(Integer.parseInt(line.substring(0,1)));
        int taille = Integer.parseInt(line.substring(0,1));
        line = scan.nextLine();
        int nb_arcs = Integer.parseInt(line.substring(0,1));
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if (i == j) {
                    this.mAdjacente.setValeur(0,i,j);
                } else {
                    this.mAdjacente.setValeur(1000,i,j);
                }
            }
        }
        for (int k = 0; k < nb_arcs; k++) {
            line = scan.nextLine();
            this.mAdjacente.setValeur(Integer.parseInt(line.substring(4, 5)), Integer.parseInt(line.substring(0, 1)), Integer.parseInt(line.substring(2, 3)));
        }
        this.mValeur = new M1_Matrice(this.mAdjacente.getMatrice(),this.mAdjacente.getTaille());
    }
    public void floyd_Warshall(){
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
