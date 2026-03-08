package Module5;

public class Thred_Life_cycle_p9 extends Thread{
    public void run() {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(1000); // Thread goes to waiting state
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Thread execution finished.");
        }

        public static void main(String[] args) {

            Thred_Life_cycle_p9 t1 = new Thred_Life_cycle_p9();

            System.out.println("State after creation: " + t1.getState());

            t1.start();
            System.out.println("State after start(): " + t1.getState());

            try {
                Thread.sleep(500);
                System.out.println("State during execution: " + t1.getState());

                t1.join();
            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println("State after completion: " + t1.getState());
        }
    }



