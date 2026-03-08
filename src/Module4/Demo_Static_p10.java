package Module4;

public class Demo_Static_p10 {
        static {
            System.out.println("Static block is executed");
        }

        Demo_Static_p10() {
            System.out.println("Constructor is executed");
        }

        public static void main(String[] args) {
            Demo_Static_p10 obj1 = new Demo_Static_p10();
            Demo_Static_p10 obj2 = new Demo_Static_p10();
        };
    }


