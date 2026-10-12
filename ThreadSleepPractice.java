
public class ThreadSleepPractice {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {

                System.out.println("Number: " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

        });

        t1.start();
    }
}
