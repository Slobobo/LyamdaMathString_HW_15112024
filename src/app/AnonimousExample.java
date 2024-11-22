package app;

class AnonimousExample {

    void executeOperation() {
        MathOperation mathOperation = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        int result = mathOperation.operate(4, 7);
        System.out.println("Addition result: " + result);
    }
}
