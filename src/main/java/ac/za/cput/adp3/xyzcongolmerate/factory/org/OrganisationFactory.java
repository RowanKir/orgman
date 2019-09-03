package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;


import java.util.UUID;

import static ac.za.cput.adp3.xyzcongolmerate.util.Helper.getSuffixFromClassName;

public class OrganisationFactory {

    //TODO: Implement body.
    public static Organisation buildOrganisation(String organisationName)
    {
        String name = getSuffixFromClassName(OrganisationFactory.class);
        return new Organisation.Builder()
                .orgCode(name + UUID.randomUUID().toString())
                .orgName(organisationName)
                .build();
    }
}
