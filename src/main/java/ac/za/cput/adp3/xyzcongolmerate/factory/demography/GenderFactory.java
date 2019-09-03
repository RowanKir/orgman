package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;

import java.util.UUID;

import static ac.za.cput.adp3.xyzcongolmerate.util.Helper.getSuffixFromClassName;


public class GenderFactory {

    public static Gender buildGender(String genderDescription)
    {
        String name = getSuffixFromClassName(GenderFactory.class);
       return new Gender.Builder()
               .genderId(name + UUID.randomUUID().toString())
               .genderDescription(genderDescription)
               .build();
    }
}
