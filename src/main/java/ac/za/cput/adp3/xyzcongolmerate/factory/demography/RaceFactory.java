package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;

public class RaceFactory {

    //TODO: Implement body
    public static Race buildRace(String raceDescription)
    {
        return new Race.Builder()
                .raceDescription(raceDescription)
                .build();
    }
}
