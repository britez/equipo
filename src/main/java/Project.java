import java.util.List;

public class Project {

    public boolean hasTeam() {
        //TODO: implement me
        return true;
    }

    public void addSprint(Sprint sp1) {
        //TODO: implement me
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
