package main.java.org.example.fichiers;
public class Arc {
    //attributs
    /**
     * destination de l'arc
     */
    private String dest;
    /**
     * cout de l'arc reliant deux noeuds
     */
    private double cout;

    // constructeur
    public Arc(String dest, double cout) {
        this.dest = dest;
        this.cout = cout;
    }

    /**
     * permet de renvoyer la destination de l'arc avec lequel la methode est appelee
     * @return renvoie l'attribut dest qui correspond a la destination
     */
    public String getDest() {
        return dest;
    }

    /**
     * permet de renvoyer le cout de l'arc avec lequel la methode est appelee
     * @return renvoie l'attribut cout
     */
    public double getCout() {
        return cout;
    }
}