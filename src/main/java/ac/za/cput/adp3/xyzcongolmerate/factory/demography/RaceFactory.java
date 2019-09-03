package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;

import java.util.UUID;

import static ac.za.cput.adp3.xyzcongolmerate.util.Helper.getSuffixFromClassName;

public class RaceFactory {

    //TODO: Implement body
    public static Race buildRace(String raceDescription)
    {
        String name = getSuffixFromClassName(RaceFactory.class);
        return new Race.Builder()
                .raceId(name + UUID.randomUUID().toString())
                .raceDescription(raceDescription)
                .build();
    }
}
