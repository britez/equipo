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
    }

    @Test
    public void testHasTeam() {
        Assert.assertTrue(project.hasTeam(equipo));
    }

    @Test
    public void testAddSprint() {
        this.project.addSprint(sp1);
        Assert.assertEquals(1, project.getSprints().size());

        this.project.addSprint(sp1);
        Assert.assertEquals(1, this.project.getSprints());
    }

    @Test
    public void testCanFinishProject() {
        Assert.assertFalse(this.project.canFinish());
        
        this.project.setTeam(equipo);
        Assert.assertFalse(this.project.canFinish());

        this.project.addSprint(sp1);
        Assert.assertFalse(this.project.canFinish());

        Developer anotherDeveloper = new Developer(
                2, "Laura", "Carelli",
                "Developer", Seniority.SENIOR, 200);

        this.equipo.agregarPersona(anotherDeveloper);
        Assert.assertTrue(this.project.canFinish());
    }
}
