package main.java.org.example.fichiers;

import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        GrapheListe g = new GrapheListe();
        g.ajouterArc("D", "B", 23);
        g.ajouterArc("B", "E", 11);
        g.ajouterArc("D", "C", 10);
        g.ajouterArc("C", "A", 19);
        g.ajouterArc("A", "B", 12);
        g.ajouterArc("E", "D", 43);
        g.ajouterArc("A", "D", 87);
        // Resolution pour BellmanFord
        int division=0;
        long duree_totale=0;
        BellmanFord b = new BellmanFord();
        for(int j=0;j<=50;j++) {
            for (int i = 11; i <= 15; i++) {
                long date_debut = System.nanoTime ();
                String nomfich = "Ressources/Graphes/Graphe" + i + ".txt";
                GrapheListe g2 = new GrapheListe(nomfich);
                Valeur valeurs = b.resoudre(g2, "A");
                System.out.println(nomfich + "\n" + valeurs);
                division++;
                long date_fin = System.nanoTime ();
                duree_totale+=date_fin-date_debut;
            }
        }
        //on convertit la duree en millisecondes
        long duree = (duree_totale)/division;
        Valeur valeurs = b.resoudre(g, "A");
        System.out.println(valeurs);
        System.out.println("\n"+"durée d'éxécution: " + duree + " nanosecondes");
    }
}