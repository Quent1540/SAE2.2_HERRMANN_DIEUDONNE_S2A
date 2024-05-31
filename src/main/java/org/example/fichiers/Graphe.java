package main.java.org.example.fichiers;
import java.util.ArrayList;
import java.util.List;

public interface Graphe{
    /**
     * renvoie l'indice du noeud n placé en parametre
     * @param n noeud dont on cherche l'indice
     * @return renvoie l'indice auquel se trouve le noeud n
     */
    int getIndice(String n);

    /**
     * permet d'ajouter un arc dans la liste d'arcs
     * @param depart depart de l'arc
     * @param destination destination de l'arc
     * @param cout cout de l'arc
     */
    void ajouterArc(String depart, String destination, double cout);

    /**
     * renvoie l'adjacence des arcs
     * @return adjacence
     */
    ArrayList<Arcs> getAdjacence();

    /**
     * convertit un graphe en chaine de caracteres qui est affichee lors de l'appel de la methode
     * @return renvoie le graphe sous forme de chaine de caracteres
     */
    String toString();
}