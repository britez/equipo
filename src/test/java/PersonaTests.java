import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonaTests {

    /*
     * Una persona no debería ser instanciada.
     * Vamos a tener Roles dentro de cada persona
     * que nos genera posiciones, pero personas a secas no.
     */



    @Test
    public void testCanFinishTask() {
        Developer developer = new Developer(1, "Maxi", "Britez", Seniority.JUNIOR);

        Assert.assertFalse(developer.canFinishTask(200));
        Assert.assertTrue(developer.canFinishTask(99));
    }

    @Test
    public void doPersonaStuff() {
        Persona persona = new Developer(1, "A", "B", Seniority.JUNIOR);
        Assert.assertEquals("I'm developer! I'm coding!", persona.doStuff());

        Persona persona1 = new QA(2, "Yanina", "Torres", Seniority.SENIOR);
        Assert.assertEquals("I'm QA! I'm finding bugs!", persona1.doStuff());
    }
}
