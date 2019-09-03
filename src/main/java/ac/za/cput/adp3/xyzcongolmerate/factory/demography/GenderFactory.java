package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;

public class GenderFactory {

    //TODO: Implement body
    public static Gender buildGender(String genderDescription)
    {
       return new Gender.Builder()
               .genderDescription(genderDescription)
               .build();
    }
}
