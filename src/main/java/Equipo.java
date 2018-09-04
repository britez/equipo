import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


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
        return 1;
    }

    public List<Seniority> getSeniorities() {
        //TODO: Implement me
        return null;
    }

    public List<Persona> getPersonaBySeniority(Seniority semisenior) {
        //TODO: Implement me
        System.out.println(semisenior);
        return this.personas.stream().filter(persona -> persona.getSeniority().equals(semisenior)).collect(Collectors.toList());

    }


}
