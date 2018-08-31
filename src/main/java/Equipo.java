import java.util.ArrayList;
import java.util.List;

public class Equipo {

    //TODO: Private? Public? Proteced? Package?
    ArrayList<Persona> personas = new ArrayList<>();

    public void agregarPersona(Persona p){
        personas.add(p);
    }


    public void imprimirEquipo(){
        System.out.println(personas);
    }

    public int getTotalPersonas() {
        //Todo: Implement me
        return 0;
    }

    public List<Seniority> getSeniorities() {
        //TODO: Implement me
        return null;
    }

    public List<Persona> getPersonaBySeniority(Seniority semisenior) {
        //TODO: Implement me
        return null;
    }
}
