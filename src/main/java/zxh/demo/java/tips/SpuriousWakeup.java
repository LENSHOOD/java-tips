package zxh.demo.java.tips;

import java.util.Random;

/**
 * SpuriousWakeup:
 * @author zhangxuhai
 * @date 2020/4/8
*/
public class SpuriousWakeup {
    private static final Random RANDOM = new Random();
    private boolean condition = RANDOM.nextBoolean();

    void notifier() {
        synchronized (this) {
            notify();
        }
    }

    void wrongWaiter() throws InterruptedException {
        synchronized (this) {
            if (condition) {
                wait();
            }
        }
    }

    void correctWaiter() throws InterruptedException {
        synchronized (this) {
            while (condition) {
                wait();
            }
        }
    }
}
