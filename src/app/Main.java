package app;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        AnonimousExample anonimousExample = new AnonimousExample();
        anonimousExample.executeOperation();

        StringManipulatorExecutor executor = new StringManipulatorExecutor();
        StringManipulator toUpperCase = input -> input.toUpperCase();
        executor.execute("heLlo world", toUpperCase);

        Function<String, Integer> countUpperCaseFunction = StringListProcessor::countUppercase;
        String test1 = "HeLLo WOrlD";
        String test2 = "java language";
        String test3 = "";
        System.out.println("Uppercase count in '" + test1 + "': " + countUpperCaseFunction.apply(test1));
        System.out.println("Uppercase count in '" + test2 + "': " + countUpperCaseFunction.apply(test2));
        System.out.println("Uppercase count in '" + test3 + "': " + countUpperCaseFunction.apply(test3));

        Supplier<Integer> randomNumberSupplier = () -> ThreadLocalRandom.current().nextInt(1, 101);
        System.out.println("Random number: " + randomNumberSupplier.get());
        System.out.println("Random number: " + randomNumberSupplier.get());
        System.out.println("Random number: " + randomNumberSupplier.get());

    }
}
