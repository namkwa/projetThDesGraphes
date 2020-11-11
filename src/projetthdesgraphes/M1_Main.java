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

        //On créer la matrice adjacente
        int ligne = 1;
        int arcs=0;
        M1_Graphes g= null;
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            if (ligne==1){
                try{
                    g= new M1_Graphes(Integer.parseInt(line.substring(0,1)));
                }
                catch(NumberFormatException e){
                    throw e;
                }
            }else if(ligne==2){
                try{
                    arcs = Integer.parseInt(line.substring(0,1));
                }
                catch(NumberFormatException e){
                    throw e;
                }
            }else if(ligne-2<=arcs){
                try{
                    //g.setmAdjacente([Integer.parseInt(line.substring(0,1))][Integer.parseInt(line.substring(2,3))]=Integer.parseInt(line.substring(4,5)));
                }
                catch(NumberFormatException e){
                    throw e;
                }
            }
            ligne++;
        }
        System.out.println(ligne);
        System.out.println(arcs);
        System.out.println(g);
    }
}
