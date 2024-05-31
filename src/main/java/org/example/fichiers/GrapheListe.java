package main.java.org.example.fichiers;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class GrapheListe implements Graphe{
    /**
     * Liste des noeuds du graphe
     */
    private ArrayList<String> noeuds;
    /**
     * liste des adjacences du graphe
     */
    private ArrayList<Arcs> adjacence;

    public GrapheListe() {
        noeuds = new ArrayList<>();
        adjacence = new ArrayList<>();
    }
    /**
     * renvoie l'indice du noeud placé en parametre dans la liste de noeuds du graphe
     * @param n noeud dont on cherche l'indice
     * @return int indice
     */
    public int getIndice(String n){
        return noeuds.indexOf(n);
    }

    /**
     * renvoie la liste des noeuds du graphe
     * @return renvoie une liste de noeuds
     */
    public ArrayList<String> getNoeuds() {
    return noeuds;
    }

    /**
     * renvoie le noeud qui se trouve apres celui passe en parametre
     * @param n noeud dont on cherche le suivant
     * @return renvoie un noeud
     */
    public ArrayList<Arc> suivants(String n) {
        ArrayList<Arc> arcss = new ArrayList<>();
        int indice = noeuds.indexOf(n);
        if (indice != -1) {
            Arcs arcs = adjacence.get(indice);
            arcss.addAll(arcs.getArcs());
        }
        return arcss;
    }

    /**
     * renvoie les adjacences du graphe
     * @return adjacence
     */
    public ArrayList<Arcs> getAdjacence(){
        return adjacence;
    }

    /**
     * ajoute un arc dans le graphe
     * @param depart depart de l'arc
     * @param destination destination de l'arc
     * @param cout cout de l'arc
     */
    public void ajouterArc(String depart, String destination, double cout){
        if (!noeuds.contains(depart)){
            noeuds.add(depart);
            adjacence.add(new Arcs());
        }
        if (!noeuds.contains(destination)){
            noeuds.add(destination);
            adjacence.add(new Arcs());
        }
        int indiceDepart = getIndice(depart);
        int indiceDestination = getIndice(destination);
        adjacence.get(indiceDepart).ajouterArc(new Arc(destination, cout));
    }

    /**
     * transforme le graphe en chaine de caracteres
     * @return renvoie une chaine de caracteres representant un graphe
     */
    public String toString(){
        String res = "";
        for (int i = 0; i < noeuds.size(); i++){
            String noeud = noeuds.get(i);
            Arcs arcss = adjacence.get(i);
            res += noeud + " -> ";
            List<Arc> arcs = arcss.getArcs();
            for(int j = 0; j < arcs.size(); j++){
                Arc arc = arcs.get(j);
                res += arc.getDest() + "(" + arc.getCout() + ")";
                if(j < arcs.size() - 1){
                    res += " ";
                }
            }
            res += "\n";
        }
        return res;
    }
}
