import java.util.ArrayList;

public class Sprint {

    private int storyPoints;

    public Sprint(){
        this.storyPoints = 300;
    }




    public Integer getStoryPoints() {
        //TODO: Implement me => LAU
        return storyPoints;
    }

    public Integer getBugsStoryPoints() {
        //TODO: Implement me
        return null;
    }

    /**
     * Para que un sprint pueda ser terminado por un equipo debe:
     * Poder terminar todos los storypoints de negocio
     * Poder terminar todos los storypoints de issues
     * @param equipo
     * @return
     */
    public Boolean canBeFinished(Equipo equipo) {
        //TODO: Implement me
        return null;
    }
}
