public class Persona {

    private int idPersona;
    private String nombre;
    private String apellido;
    private Seniority seniority;
    private int points;

    //constructor vacio
    //TODO: Un constructor vacío no recibe parámetros
    //TODO: Este constructor recibe un Senority como string
    Persona(int idPersona, String nombre, String apellido, String puesto, String seniority, int points) {
        //asignamos el id producto unico por cada objeto creado
        //this.idPersona = ++contadorPersona;
    }

    //TODO: Ojo por que tenes un parámetro puesto que no hace nada
    public Persona(int idPersona, String nombre, String apellido, String puesto, Seniority seniority, int points) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.seniority = Seniority.JUNIOR;
        this.points = points;
    }

    public static void indicarSeniorty(Seniority seniority){
        switch (seniority){
            //Podemos usar algun valor constante
            //de la enumeracion directamente
            case JUNIOR:
                System.out.println("Los historyPoints " + seniority + ": " + seniority.getPoints());
                break;
            default:
                System.out.println("Y asi seguimos con los demas continentes");
        }
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
}
