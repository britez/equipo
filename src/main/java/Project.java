import java.util.ArrayList;
import java.util.List;

public class Project {

    ArrayList<Equipo> equipos = new ArrayList<>();

    public boolean hasTeam(Equipo e) {
        //TODO: implement me => LAU TODO
        equipos.add(e);
        return true;
    }

    ArrayList<Sprint> sprints = new ArrayList<>();

    public int addSprint(Sprint sp1) {
        //TODO: implement me


        System.out.println(sp1);
        return 1;
    }

    public List<Sprint> getSprints() {
        //TODO: implement me
        return null;
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
        return false;
    }

    public void setTeam(Equipo equipo) {
        //TODO: implement me
    }
}
