public class Thread_LambdaRunnable {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread running (lambda way)");
        });
        t.start();
    }
}
