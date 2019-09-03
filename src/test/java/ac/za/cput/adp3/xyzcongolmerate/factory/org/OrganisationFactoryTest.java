package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {

    @Test
    public void buildOrganisation() {

        Organisation org1 = OrganisationFactory.buildOrganisation("Kinetic Skunk");
        Organisation org2 = OrganisationFactory.buildOrganisation("Amazon");

        assertNotNull(org1);
        assertEquals(org1.getOrgName(), "Kinetic Skunk");
        assertTrue(org1 instanceof Organisation);
        assertNotEquals(org1.getOrgName(), org2.getOrgName());

        System.out.println("Two different organizations called: \n" +org1.toString() +" and " +org2.toString());
    }
}