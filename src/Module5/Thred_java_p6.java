package Module5;

public class Thred_java_p6 extends Thread {
    public void run(){
            for(int i=0;i<10; i++){
                System.out.println("thread is running");
            }
        }
        static void main(String[] args) {
            Thred_java_p6 t1 = new Thred_java_p6();
            t1.start();
            for (int i = 0; i < 10; i++) {
                System.out.println("Main thread is running");
            }
        }
    }




