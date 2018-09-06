import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Project {

    private Equipo equipo;

    private ArrayList<Sprint> sprints = new ArrayList<>();

    public void setTeam(Equipo equipo) {
        //TODO: implement me => LAU
        this.equipo = equipo;
        this.equipo.agregarPersona(new ScrumMaster(01,"Maxi", "Britez", "Scrum Master", Seniority.SENIOR, 200));
        this.equipo.agregarPersona(new Developer(02, "Rodri", "Sellanes", "Developer", Seniority.SENIOR, 200));
        this.equipo.agregarPersona(new QA(03, "Yani", "Torres", "qa", Seniority.SENIOR,200 ));

    }

    public boolean hasTeam(Equipo e) {
        //TODO: implement me => LAU
        return e.equals(equipo);
    }


    public void addSprint(Sprint sp1) {
        //TODO: implement me => LAU
        if(!sprints.contains(sp1))
            sprints.add(sp1);

    }

    public List<Sprint> getSprints() {
        //TODO: implement me => LAU
        return sprints;
    }

    /**
     * Para que un proyecto pueda ser terminado tiene que:
     * Tener un equipo
     * Tiene que tener un sprint
     * Tiene que tener un SM, DEV y QA
     * Todos los sprints pueden ser terminados
     * @return
     */
    public boolean canFinish() {
        //TODO: implement me

        if(equipo != null && !sprints.isEmpty()) {
            //primero instanceOf fijarme los puestos que tengo, tengo que recorrer la lista de personas del
            //equipo, y fijarme tener las seniorities
            //System.out.println(this.equipo.);
            return true;
        }
        return false;
    }

}
