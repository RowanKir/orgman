package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;

public class RoleFactory {

    //TODO: Implement body
    public static Role buildRole(String roleName)
    {
        return new Role.Builder()
                .roleName(roleName)
                .build();
    }
}
