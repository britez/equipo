import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProjectTests {

    private Project project;
    private Sprint sp1;
    private Equipo equipo;

    @Before
    public void setup() {
        this.project = new Project();
        this.equipo = new Equipo();

        this.sp1 = new Sprint();
    }



    @Test
    public void testHasTeam() {
        this.project.setTeam(equipo);
        Assert.assertTrue(project.hasTeam(equipo));
    }

    @Test
    public void testAddSprint() {
        this.project.addSprint(sp1);
        Assert.assertEquals(1, project.getSprints().size());

        this.project.addSprint(sp1);
        Assert.assertEquals(1, this.project.getSprints().size());
    }

    @Test
    public void testCanFinishProject() {

        Assert.assertFalse(this.project.canFinish());

        this.project.setTeam(equipo);
        this.project.addSprint(sp1);

        Developer anotherDeveloper = new Developer(
                2, "Laura", "Carelli",
                "Developer", Seniority.SENIOR, 200);

        this.equipo.agregarPersona(anotherDeveloper);
        Assert.assertTrue(this.project.canFinish());
    }
}
