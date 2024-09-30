package someSimpleTasks;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimer extends TimerTask {
    private final Timer timer;
    private int count = 0;
    public MyTimer(Timer timer) {
        this.timer = timer;
    }
    @Override
    public void run() {
        if(this.count < 5) {
            System.out.println("Hello from MyTimer!!!");
        } else {
            this.timer.cancel();
        }
        this.count++;
    }
}
