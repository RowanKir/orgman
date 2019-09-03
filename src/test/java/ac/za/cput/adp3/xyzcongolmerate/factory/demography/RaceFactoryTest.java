package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void buildRace() {
        Race C = RaceFactory.buildRace("Coloured");
        Race W = RaceFactory.buildRace("White");
        Race B = RaceFactory.buildRace("Black");

        assertNotNull(C);
        assertEquals(C.getRaceDescription().equals("Coloured"), true);
        assertTrue(C instanceof Race);
        assertNotEquals(C.getRaceDescription(), W.getRaceDescription());
        System.out.println("The race of this individual is classified as: " +C.getRaceDescription());

    }
}