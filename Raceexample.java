class counter {
    int count = 0;

    public void increment() {
        count++;
    }
}

public class Raceexample {
    public static void main(String[] args) throws InterruptedException {
        counter c1 = new counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c1.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c1.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count (should be 2000): " + c1.count);
    }
}
