class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running using Thread class");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // starts a new thread, calls run()
    }
}
