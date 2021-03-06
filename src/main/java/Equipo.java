import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class  Equipo  extends Project{

    //TODO: Private? Public? Proteced? Package?
    private ArrayList<Persona> personas = new ArrayList<>();

    public void agregarPersona(Persona p){
        personas.add(p);
    }


    public void imprimirEquipo(){
        System.out.println(personas);
    }

    public int getTotalPersonas() {
        //Tengo que hacer un count del array personas, y devolver la cantidad
        return this.personas.size();
    }

    public List<Seniority> getSeniorities() {
        //TODO: Implement me => LAU
        //Devolver la lista de los seniorities que vienen dentro del array personas
        return this.personas.stream().map(Persona::getSeniority).distinct().collect(Collectors.toList());
    }

    public List<Persona> getPersonaBySeniority(Seniority semisenior) {
        //TODO: Implement me => LAU
        //Filtrar del array el seniority especificado
        return this.personas.stream().filter(persona -> persona.getSeniority().equals(semisenior)).collect(Collectors.toList());

    }


}
