import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class $20GenerateRandomIntStringAgain {
    public static void main(String[] args) {
        // usingRandomApproachNew();
        //usingMathModuleNew();
        usingApacheCommonLangApiNew();
    }

    private static void usingRandomApproachNew() {
        Random rand_num = new Random();
        int rand_int = rand_num.nextInt(10);
        System.out.println(rand_int);

        double rand_dbl = rand_num.nextDouble();
        System.out.println(rand_dbl);

    }

    private static void usingMathModuleNew() {
        System.out.println(Math.random());
    }

    private static void usingApacheCommonLangApiNew() {
        String randInteger = RandomStringUtils.randomNumeric(10);
        System.out.println(randInteger);
        String randStringValue = RandomStringUtils.randomAlphabetic(5);
        System.out.println(randStringValue);
    }
}
