public class MultipleThreads_UsingLambda {
    public static void main(String[] args) {
        Thread downloadThread = new Thread(() -> {
            System.out.println("Downloading file... [" + Thread.currentThread().getName() + "]");
        }, "Download-Thread");

        Thread processThread = new Thread(() -> {
            System.out.println("Processing file... [" + Thread.currentThread().getName() + "]");
        }, "Process-Thread");

        downloadThread.start();
        processThread.start();
    }
}
