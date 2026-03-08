package Module5;

public class runabble_p7 implements  Runnable{
    public void run(){
            for(int i=0;i<10;i++){
                System.out.println("thread is running");
            }
        }
        static void main(String[] args) {
            runabble_p7 obj = new runabble_p7();
            Thread t1 = new Thread(obj);
            t1.start();
            for(int i=0;i<10;i++){
                System.out.println("main threasd is running");
            }
        }
    }


