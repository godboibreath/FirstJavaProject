package threadsStudy;

public class MyThread extends Thread {
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("My thread");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
