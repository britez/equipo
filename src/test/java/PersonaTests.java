import org.junit.Assert;
import org.junit.Test;

public class PersonaTests {

    /*
     * Una persona no debería ser instanciada.
     * Vamos a tener Roles dentro de cada persona
     * que nos genera posiciones, pero personas a secas no.
     */
    @Test
    public void testCrear() {
        Persona persona = new Persona(1, "Laura", "Carelli", "Developer", Seniority.JUNIOR, 10);
        Assert.assertNull(persona);
        Assert.fail("No podría instanciar nunca una persona");
    }

    @Test
    public void testCanFinishTask() {
        Developer developer = new Developer(1, "Maxi", "Britez", "Developer", Seniority.JUNIOR, 100);

        Assert.assertFalse(developer.canFinishTask(200));
        Assert.assertTrue(developer.canFinishTask(99));
    }
}
