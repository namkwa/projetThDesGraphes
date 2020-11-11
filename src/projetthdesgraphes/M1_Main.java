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

        //On print chaque ligne
        /*int ligne = 1;
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            System.out.println("line " + ligne + " :" + line);
            ligne++;
        }*/

        M1_Graphes g=new M1_Graphes(5);
        System.out.println(g);
    }
}
