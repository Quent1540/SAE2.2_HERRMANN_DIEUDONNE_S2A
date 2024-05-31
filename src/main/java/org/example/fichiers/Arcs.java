package main.java.org.example.fichiers;
import java.util.List;
import java.util.ArrayList;
public class Arcs{
    /**
     * Liste des differents arcs qui relient les sommmets
     */
    private List<Arc> arcs;

    public Arcs(){
        arcs = new ArrayList<>();
    }

    /**
     * permet d'ajouter un arc dans la liste d'arcs
     * @param a arc a ajouter
     */
    public void ajouterArc(Arc a){
        arcs.add(a);
    }

    /**
     * permet d'obtenir la liste de tous les arcs
     * @return renvoie l'attribut arcs qui correspond a la liste de tous les arcs du graphe
     */
    public List<Arc> getArcs(){
        return arcs;
    }
}