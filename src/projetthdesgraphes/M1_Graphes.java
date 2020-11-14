package projetthdesgraphes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class M1_Graphes {
    M1_Matrice mValeur;
    M1_Matrice mAdjacente;

    public M1_Graphes(Scanner scan) {
        //On récupére la taille du graphe et on créer la matrice adjacente
        String line = scan.nextLine();
        int taille = Integer.parseInt(line.substring(0));
        this.mAdjacente = new M1_Matrice(taille);

        //On initialise la diagonale à 0 et le reste à infinie(plus grand nombre géré par Java)
        line = scan.nextLine();
        int nb_arcs = Integer.parseInt(line);
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if (i == j) {
                    this.mAdjacente.setValeur(0,i,j);
                } else {
                    this.mAdjacente.setValeur(Integer.MAX_VALUE,i,j);
                }
            }
        }

        //On enregistre les valeurs des arcs du fichiers dans la matrice adjacente
        for (int k = 0; k < nb_arcs; k++) {
            line = scan.nextLine();
            int space1=line.indexOf(" ");
            int space2=line.indexOf(" ", space1+1);
            this.mAdjacente.setValeur(Integer.parseInt(line.substring(space2+1)), Integer.parseInt(line.substring(0, space1)), Integer.parseInt(line.substring(space1+1,space2)));
        }
        //On initialise la matrice de valeur avec les données de la matrice adjacente
        this.mValeur = new M1_Matrice(this.mAdjacente.getMatrice(),this.mAdjacente.getTaille());
    }

    public void floyd_Warshall() {
        int taille = this.mValeur.getTaille();
        for ( int k = 0; k < taille; k++){
            for (int i = 0; i < taille; i++) {
                for (int j = 0; j < taille; j++) {
                    this.mValeur.setValeur(Math.min(this.mValeur.getValeur(i,j), this.mValeur.getValeur(i,k) + this.mValeur.getValeur(k,j)),i,j);
                }
            }
            System.out.println(this.mValeur);
        }
        for (int l = 0; l < taille; l++) {
            if (this.mValeur.getValeur(l,l) < 0) {
                System.out.println("il y a au moins un circuit absorbant");
                return ;
            }
        }
        System.out.println("il n'y a aucun circuit absorbant");
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if (this.mValeur.getValeur(i,j) != 1000) {
                    System.out.println("taille du chemin le plus court entre " + i + " et " + j + ": " + this.mValeur.getValeur(i,j));
                }
            }
        }
    }

    @Override
    public String toString() {
        return"mValeur" + this.mValeur.toString() + "\nmAdjacente" + this.mAdjacente.toString();
    }
}
