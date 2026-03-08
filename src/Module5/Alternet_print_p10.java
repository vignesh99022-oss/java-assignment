package Module5;

class Alternet_print_p10 {

        int num = 1;

        synchronized void printNumbers() {
            while (num <= 10) {
                System.out.println(Thread.currentThread().getName() + " : " + num);
                num++;
                notify();
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            notify();
        }
    }

    class TwoThreadsExample {
        public static void main(String[] args) {

            Alternet_print_p10 obj = new Alternet_print_p10();

            Thread t1 = new Thread(() -> obj.printNumbers(), "Thread 1");
            Thread t2 = new Thread(() -> obj.printNumbers(), "Thread 2");

            t1.start();
            t2.start();
        }
    }


