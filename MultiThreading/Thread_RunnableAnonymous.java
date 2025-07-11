public class Thread_RunnableAnonymous {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Thread running (traditional way)");
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
