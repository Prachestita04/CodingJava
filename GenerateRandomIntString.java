import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class GenerateRandomIntString {
    public static void main(String[] args) {
        // usingRandomApproach();
        //usingMathModule();
        usingApacheCommonLangApi();
    }

    private static void usingRandomApproach() {
        Random rand = new Random();
        int random_int = rand.nextInt(10); //we have to specify the range means if we give 10 then it ranges from 0-9
        System.out.println(random_int);

        double random_double = rand.nextDouble(); // no need to give range and it will be 0.0 to less than 1.0
        System.out.println(random_double);
    }

    private static void usingMathModule() {
        System.out.println(Math.random()); // give decimal value 0.0 to <1.0
    }

    private static void usingApacheCommonLangApi() {
        String randNum = RandomStringUtils.randomNumeric(10);
        System.out.println(randNum);
        String randStr = RandomStringUtils.randomAlphabetic(5);
        System.out.println(randStr);
    }
}
