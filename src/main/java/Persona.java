public abstract class Persona implements Stuffable{


    private int idPersona;
    private String nombre;
    private String apellido;
    private Seniority seniority;



    //TODO: Ojo por que tenes un parámetro puesto que no hace  ==> fix to Lau

    public Persona(int idPersona, String nombre, String apellido, Seniority seniority) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.seniority = seniority;

    }

    //
    public Seniority getSeniority() {
        return seniority;
    }


    public void setSeniority(Seniority seniority) {
        this.seniority = seniority;
    }


    /**
     * Una persona puede terminar una tarea si con su seniority
     * no supera la cantidad máxima de story points permitidos
     * @param totalStoryPoints
     * @return
     */
    public boolean canFinishTask(int totalStoryPoints) {
        //TODO: Implement me => TODO
        return totalStoryPoints<=this.seniority.getPoints();
    }

}
