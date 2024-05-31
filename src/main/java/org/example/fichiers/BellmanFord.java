package main.java.org.example.fichiers;
import main.java.org.example.fichiers.Algorithme;

import main.java.org.example.fichiers.Arc;
import main.java.org.example.fichiers.Arcs;
import main.java.org.example.fichiers.GrapheListe;
public class BellmanFord implements Algorithme {
    /**
     * methode permettant de trouver le plus court chemin en utilisant BellmanFord
     * @param g graphe utilisé
     * @param depart noeud de depart de l'algorithme
     * @return
     */
    public Valeur resoudre(GrapheListe g, String depart){
        Valeur valeurs = new Valeur();
        boolean modification=true;
        for (String noeud : g.getNoeuds()){
            valeurs.setValeur(noeud, Double.MAX_VALUE);
            valeurs.setParent(noeud, null);
        }
        valeurs.setValeur(depart,0);
        while (modification){
            modification = false;
            for (String noeud : g.getNoeuds()){
                double distanceNoeud = valeurs.getValeur(noeud);
                for (Arc arc : g.suivants(noeud)){
                    double NouvelleDistance = distanceNoeud + arc.getCout();
                    if (NouvelleDistance < valeurs.getValeur(arc.getDest())){
                        valeurs.setValeur(arc.getDest(), NouvelleDistance);
                        valeurs.setParent(arc.getDest(), noeud);
                        modification = true;
                    }
                }
            }
        }
        return valeurs;
    }
}