public class Main {


    public static void main(String[] args) {

        //Creamos equipo
        Persona p1 = new Persona(01,"Laura", "Carelli","Dev", Seniority.JUNIOR, 10);
        Persona p2 = new Persona(02,"Lucas", "Tarcetti","ScrumMaster", Seniority.SENIOR, 30);
        Persona p3 = new Persona(03,"Maxi", "Britez","ScrumMaster", Seniority.SENIOR, 30);
        Persona p4 = new Persona(04,"Nacho", "Mieites","QA", Seniority.SEMISENIOR, 20);

        Equipo e1 = new Equipo();
        e1.agregarPersona(p1);
        e1.agregarPersona(p2);
        e1.imprimirEquipo();

        Equipo e2 = new Equipo();
        e2.agregarPersona(p3);
        e2.agregarPersona(p4);
        e2.imprimirEquipo();
    }
}
