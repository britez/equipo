import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SprintTests {

    private Sprint sprint;

    @Before
    public void setup() {
        this.sprint = new Sprint();
    }

    @Test
    public void testGetStoryPoints() {
        Assert.assertNotNull(this.sprint.getStoryPoints());
    }

    @Test
    public void testGetBugsStoryPoints() {
        Assert.assertNotNull(this.sprint.getBugsStoryPoints());
    }

    @Test
    public void testCanFinishSprint() {
        Equipo equipo = new Equipo();
        Assert.assertTrue(this.sprint.canBeFinished(equipo));
    }
}
