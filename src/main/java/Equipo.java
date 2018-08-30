import java.util.ArrayList;

public class Equipo {

    ArrayList<Persona> personas = new ArrayList<>();



    public void agregarPersona(Persona p){
        personas.add(p);
    }


    public void imprimirEquipo(){
        System.out.println(personas);
    }


}
