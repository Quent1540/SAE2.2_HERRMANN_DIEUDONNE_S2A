package main.java.org.example.fichiers;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;

public class MainDijkstra{

    public static void main(String[] args) {
        GrapheListe g = new GrapheListe();
        g.ajouterArc("D", "B", 23);
        g.ajouterArc("B", "E", 11);
        g.ajouterArc("D", "C", 10);
        g.ajouterArc("C", "A", 19);
        g.ajouterArc("A", "B", 12);
        g.ajouterArc("E", "D", 43);
        g.ajouterArc("A", "D", 87);

        long date_debut = System.nanoTime ();
        // Calculer le chemin le plus court avec algorithme de Dijkstra
        Dijkstra d = new Dijkstra();
        Valeur valeurs = d.resoudre(g, "A");
        System.out.println(valeurs);
        long date_fin = System.nanoTime ();
        long duree = (date_fin  - date_debut)/ 1000000;
        System.out.println("durée d'éxécution: " + duree + " millisecondes" + "\n");

        // Afficher les chemins pour des nœuds donnés
        String[] noeudsDestionations = {"B", "C", "D", "E"};
        for (String destination : noeudsDestionations) {
            List<String> chemin = valeurs.calculerChemin(destination);
            System.out.println("Chemin de A" + " à " + destination + " : " + chemin);
        }
    }
}

