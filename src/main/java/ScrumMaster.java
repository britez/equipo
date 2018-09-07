public class ScrumMaster extends Persona {

    public ScrumMaster(int idPersona, String nombre, String apellido, Seniority seniority) {
        super(idPersona, nombre, apellido, seniority);
    }

    @Override
    public String doStuff() {
        return "I'm SM";
    }
}
