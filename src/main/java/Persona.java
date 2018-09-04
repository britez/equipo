public class Persona {

    private int idPersona;
    private String nombre;
    private String apellido;
    private String puesto;

    private Seniority seniority;
    private int points;


    //TODO: Ojo por que tenes un parámetro puesto que no hace  ==> fix to Lau
    public Persona(int idPersona, String nombre, String apellido, String puesto, Seniority seniority, int points) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.seniority = seniority;
        this.points = points;
    }


    public Seniority getSeniority() {
        return seniority;
    }

    public void setSeniority(Seniority seniority) {
        this.seniority = seniority;
    }


    @Override
    public String toString(){
        return this.nombre + " " + this.apellido;
    }

    /**
     * Una persona puede terminar una tarea si con su seniority
     * no supera la cantidad máxima de story points permitidos
     * @param totalStoryPoints
     * @return
     */
    public boolean canFinishTask(int totalStoryPoints) {
        //TODO: Implement me
        return false;
    }

    public String doStuff() {
        //TODO: Implement me
        //si es un developer debe devolver un string y si es un qa debe otro
        if (puesto == "Developer"){
            return "I'm developer! I'm coding!";
        }
        else {
            return "I'm QA! I'm finding bugs!";
        }
    }
}
