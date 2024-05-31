package main.java.org.example.fichiers;

import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        // Resolution pour BellmanFord
        int division=0;
        long duree_totale=0;
        BellmanFord b = new BellmanFord();
        for(int j=0;j<=50;j++) {
            for (int i = 11; i <= 15; i++) {
                long date_debut = System.nanoTime ();
                String nomfich = "Ressources/Graphes/Graphe" + i + ".txt";
                GrapheListe g = new GrapheListe(nomfich);
                Valeur valeurs = b.resoudre(g, "A");
                System.out.println(nomfich + "\n" + valeurs);
                division++;
                long date_fin = System.nanoTime ();
                duree_totale+=date_fin-date_debut;
            }
        }
        //on convertit la duree en millisecondes
        long duree = (duree_totale)/division;
        System.out.println("durée d'éxécution: " + duree + " nanosecondes");
    }
}