public class QA extends Persona {


    public QA(int idPersona, String nombre, String apellido, Seniority seniority) {
        super(idPersona, nombre, apellido, seniority);
    }

    @Override
    public String doStuff() {
        return "I'm QA! I'm finding bugs!";
    }
}
