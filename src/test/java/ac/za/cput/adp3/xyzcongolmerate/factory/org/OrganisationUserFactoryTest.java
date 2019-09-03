package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    @Test
    public void buildOrganisationUser()
    {
        OrganisationUser orgUser1 = OrganisationUserFactory.buildOrganisationUser(UUID.randomUUID().toString(), "rowankirchner@kineticskunk.com");
        OrganisationUser orgUser2 = OrganisationUserFactory.buildOrganisationUser(UUID.randomUUID().toString(), "ethanstoffels@gmail.gov");

        assertNotNull(orgUser1);
        assertEquals(orgUser1.getUserEmail(), "rowankirchner@kineticskunk.com");
        assertNotEquals(orgUser1.getOrgCode(), orgUser2.getOrgCode());
        assertTrue(orgUser1 instanceof OrganisationUser);

        System.out.println("Two different Organizational users: \n" +orgUser1.toString() +" and " +orgUser2.toString());
    }
}