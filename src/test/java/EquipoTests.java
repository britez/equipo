import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class EquipoTests {

    private Equipo equipo;
    private Developer developer;
    private Developer anotherDeveloper;
    private QA qa;

    @Before
    public void setup() {
        equipo = new Equipo();
        developer = new Developer(
            1,
            "Julian",
            "Avaca",
            "Developer",
            Seniority.JUNIOR,
            10);

        anotherDeveloper = new Developer(
                1,
                "Gisela",
                "Lopes",
                "Developer",
                Seniority.SEMISENIOR,
                100);

        //TODO: Fix me - LAU: todo
        qa = new QA(
                2,
                "Yanina",
                "Torres",
                "QA",
                Seniority.SEMISENIOR,
                200);

        qa = new QA(
                4,
                "Lola",
                "Mora",
                "QA",
                Seniority.JUNIOR,
                100);

    }

    @Test
    public void testCantidadEquipo() {
        equipo.agregarPersona(developer);
        Assert.assertEquals(1, equipo.getTotalPersonas());

        equipo.agregarPersona(anotherDeveloper);
        Assert.assertEquals(1, equipo.getTotalPersonas());

        equipo.agregarPersona(qa);
        Assert.assertEquals(2, equipo.getTotalPersonas());
    }

    @Test
    public void testGetSeniorities(){
        equipo.agregarPersona(developer);
        equipo.agregarPersona(anotherDeveloper);
        equipo.agregarPersona(qa);
        List<Seniority> listOfSeniorities = equipo.getSeniorities();
        Assert.assertEquals(2, listOfSeniorities.size());
    }

    @Test
    public void testGetPersonaBySeniority() {
        equipo.agregarPersona(developer);
        equipo.agregarPersona(qa);
        equipo.agregarPersona(anotherDeveloper);
        List<Persona> listOfPersonas = equipo.getPersonaBySeniority(Seniority.SEMISENIOR);
        Assert.assertEquals(2, listOfPersonas);
    }
}
