package Module4;

public class Garbage_Collection_p7 {
    public void finalize() {
        System.out.println("garbage collected");
    }

    static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Garbage_Collection_p7 obj = new Garbage_Collection_p7();
            obj = null;
        }
        System.gc();
    }
}



