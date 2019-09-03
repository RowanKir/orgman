package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
//import com.sun.tools.javac.jvm.Gen;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    @Test
    public void buildGender() {

        Gender M = GenderFactory.buildGender("Male");
        Gender F = GenderFactory.buildGender("Female");

        assertNotNull(M);
        assertTrue(M instanceof Gender);
        assertEquals(M.getGenderDescription().equals("Male"), true);

        System.out.println(M.toString());

    }
}