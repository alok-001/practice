package multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintNumWithThreeThread {
    public static void main(String[] args) {
        ThreeThreadPrinter printer = new ThreeThreadPrinter();

        Thread t1 = new Thread(() -> printer.print(1), "T1");
        Thread t2 = new Thread(() -> printer.print(2), "T2");
        Thread t3 = new Thread(() -> printer.print(0), "T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
class ThreeThreadPrinter {

    private int number = 1;
    private final int MAX = 10;

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public void print(int remainder) {
        while (true) {
            lock.lock();
            try {
                while (number <= MAX && number % 3 != remainder) {
                    condition.await();
                }

                if (number > MAX) {
                    condition.signalAll();
                    break;
                }

                System.out.println(Thread.currentThread().getName() + " : " + number++);
                condition.signalAll();

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                lock.unlock();
            }
        }
    }
}
