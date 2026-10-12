
public class SingleThreadPractice {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }

        });

        t1.start();
    }
}
    

