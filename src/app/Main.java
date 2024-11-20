package app;

public class Main {
    public static void main(String[] args) {

        AnonimousExample anonimousExample = new AnonimousExample();
        anonimousExample.executeOperation();

        StringManipulatorExecutor executor = new StringManipulatorExecutor();
        StringManipulator toUpperCase = input -> input.toUpperCase();
        executor.execute("hello world", toUpperCase);

        String test1 = "HeLLo WOrlD";
        String test2 = "java language";
        String test3 = "";
        System.out.println("Uppercase count in '" + test1 + "': " + StringListProcessor.countUppercase(test1));
        System.out.println("Uppercase count in '" + test2 + "': " + StringListProcessor.countUppercase(test2));
        System.out.println("Uppercase count in '" + test3 + "': " + StringListProcessor.countUppercase(test3));

    }
}
