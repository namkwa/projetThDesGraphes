package projetthdesgraphes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class M1_Main {
    public static void main(String[] args) throws FileNotFoundException {
        boolean fin = true;
        while (fin) {
            Scanner saisieUtilisateur = new Scanner(System.in);
            System.out.println("choisissez un graphe :");
            int numero_graphe = saisieUtilisateur.nextInt();
            String graphe_choisi = "./Graphe" + numero_graphe;
            File text = new File(graphe_choisi);

            //On crée un objet Scanner avec le fichier en paramètre
            Scanner scan = new Scanner(text);
            M1_Graphes graphe = new M1_Graphes(scan);
            System.out.println("Graphe original");
            System.out.println(graphe.mAdjacente);
            System.out.println("\nFloyd Warshall");
            graphe.floyd_Warshall();
            Scanner continuation = new Scanner(System.in);
            System.out.println("\nvoulez-vous sélectionner un autre graphe ?\ny\nn");
            String reponse = continuation.next();
            fin = (reponse.equals("y"));
            System.out.println(1/2);
            }
        }
    }