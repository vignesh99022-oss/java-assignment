package Module5;

public class Throw_example_p5 {
    static void divide(int a, int b) throws ArithmeticException {
            int result = a / b;
            System.out.println("Result = " + result);
        }

        public static void main(String[] args) {
            try {
                divide(10, 0);
            }
            catch (ArithmeticException e) {
                System.out.println("Exception handled: Cannot divide by zero");
            }
        }
    }


