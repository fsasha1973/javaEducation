package lr13.zd4;

public class MyThread extends Thread {
    private int threadNumber;

    public MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    public void run() {
        System.out.println("Thread " + threadNumber + " is running");
    }
}
