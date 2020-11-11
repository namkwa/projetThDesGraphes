package projetthdesgraphes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class M1_Main {
    public static void main(String[] args) throws FileNotFoundException {
        //On donne le chemin du fichier
        File text = new File("./GraphesTests.txt");

        //On créer un objet Scanner avec le fichier en paramétre
        Scanner scan = new Scanner(text);
        M1_Graphes graphe = new M1_Graphes(scan);
        System.out.println(graphe);
        graphe.floyd_Warshall();

        }
    }
