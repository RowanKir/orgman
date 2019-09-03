package ac.za.cput.adp3.xyzcongolmerate.util;

import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String concat = getClassName(aClass);

        char c;
        String name = "";

        for(int i = 0; i < concat.length(); i++){
            c = concat.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                name += c;
            }
        }
        return name;
    }
}
