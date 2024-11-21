package app;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {
    public static int generateRandomNumber (int min, int max){
        if (min > max){
            throw new IllegalArgumentException("Min value should be less then Max value");
        }
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
