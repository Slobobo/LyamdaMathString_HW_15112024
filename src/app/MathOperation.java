package app;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

class AnonimousExample {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        System.out.println("Addition result: " + mathOperation.operate(4, 7));
    }
}
