import java.util.Collection;
import java.util.Iterator;

public class Matriculaa extends Estudiant {

    public static final int valorcredit = 15;
    public long id = 0;
    private String nombre = "";
    private String cognoms = "";
    private String dni = "";
    private int curs = 0;
    private Collection assignatures;

    public Matriculaa(){}

    public Matriculaa(long id, String nom, String cognoms, String dni, int curs, Collection assignatures) {
        this.id = id;
        this.nombre = nom;
        this.cognoms = cognoms;
        this.dni = dni;
        this.curs = curs;
        this.assignatures = assignatures;
    }
    /** Declaracion de la clase costMatricula.
     @return cost se encarga de devolvernos el resultado final
     */
    public float costMatricula(){

        float cost = 0;
        int credits = 0;

        for (Iterator iter = assignatures.iterator(); iter.hasNext();) {
            Assignatura element = (Assignatura) iter.next();
            credits = credits + element.credits;
        }

        cost = credits * valorcredit;
        return cost;

    }

}