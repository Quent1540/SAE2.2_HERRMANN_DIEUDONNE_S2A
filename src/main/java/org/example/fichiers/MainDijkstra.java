package main.java.org.example.fichiers;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.util.List;

public class MainDijkstra{

    public static void main(String[] args) throws IOException {
        int division = 0;
        Dijkstra d = new Dijkstra();
        // Calculer le chemin le plus court avec algorithme de Dijkstra
        long duree_totale=0;
        for(int j = 0;j<=50;j++) {
            for (int i = 11; i <= 15; i++) {
                long date_debut = System.nanoTime ();
                String nomfich = "Ressources/Graphes/Graphe" + i + ".txt";
                GrapheListe g2 = new GrapheListe(nomfich);
                Valeur valeurs = d.resoudre(g2, "A");
                System.out.println(nomfich+"\n"+valeurs);
                division++;
                long date_fin = System.nanoTime ();
                duree_totale+=date_fin-date_debut;
            }
        }
        long duree = (duree_totale)/division;
        System.out.println("durée d'éxécution: " + duree + " nanosecondes" + "\n");

        // Afficher les chemins pour des nœuds donnés
        GrapheListe g = new GrapheListe();
        g.ajouterArc("D", "B", 23);
        g.ajouterArc("B", "E", 11);
        g.ajouterArc("D", "C", 10);
        g.ajouterArc("C", "A", 19);
        g.ajouterArc("A", "B", 12);
        g.ajouterArc("E", "D", 43);
        g.ajouterArc("A", "D", 87);
        String[] noeudsDestionations = {"B", "C", "D", "E"};
        for (String destination : noeudsDestionations) {
            Valeur valeurs = d.resoudre(g, "A");
            List<String> chemin = valeurs.calculerChemin(destination);
            System.out.println("Chemin de A" + " à " + destination + " : " + chemin);
        }
    }
}

