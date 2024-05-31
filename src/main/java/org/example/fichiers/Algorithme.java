package main.java.org.example.fichiers;

public interface Algorithme {
    /**
     * permet de resoudre un graphe en utilisant l'algorithme approprié
     * @param g graphe a resoudre
     * @param depart point de depart du graphe
     * @return renvoie le plus court chemin
     */
    Valeur resoudre(GrapheListe g, String depart);
}
