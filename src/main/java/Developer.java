public class Developer extends Persona {


    public Developer(int idPersona, String nombre, String apellido, Seniority seniority) {
        super(idPersona, nombre, apellido, seniority);
    }

    @Override
    public String doStuff() {
        return "I'm developer! I'm coding!";
    }
}
