package main.java.org.example.fichiers;
import java.util.ArrayList;
import java.util.List;

public interface Graphe{
    int getIndice(String n);
    void ajouterArc(String depart, String destination, double cout);
    ArrayList<Arcs> getAdjacence();
    String toString();
}