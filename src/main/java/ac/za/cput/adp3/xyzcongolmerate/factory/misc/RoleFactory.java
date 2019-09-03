package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;


import java.util.UUID;

import static ac.za.cput.adp3.xyzcongolmerate.util.Helper.getSuffixFromClassName;

public class RoleFactory {

    //TODO: Implement body
    public static Role buildRole(String roleName)
    {
        String name = getSuffixFromClassName(RoleFactory.class);
        return new Role.Builder()
                .roleId(name + UUID.randomUUID().toString())
                .roleName(roleName)
                .build();
    }
}
