package Module5;

public class Arithamadic_p1 {
        static void main(String[] args) {
            int i = 1, j = 0, k;
            try {
                k = i / j;
            } catch (ArithmeticException e) {
                System.out.println("we cannot divide any number by zero");
            }
        }
    }


