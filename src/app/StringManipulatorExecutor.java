package app;

public class StringManipulatorExecutor {
    public void execute (String input, StringManipulator manipulator){
     String result = manipulator.manipulate(input);
        System.out.println("Result " + result);
    }
}
