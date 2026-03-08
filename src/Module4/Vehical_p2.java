package Module4;

public interface Vehical_p2 {
    void start();
    }
    class Car implements Vehical_p2 {
        public void start() {
            System.out.println("car is starting!");
        }

        static void main(String[] args) {
            Car c = new Car();
            c.start();
        }
    }


