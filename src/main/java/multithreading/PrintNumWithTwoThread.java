package multithreading;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintNumWithTwoThread {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();
// Synchronized
        Thread t1 = new Thread(() -> printer.printOdd(), "Odd-Thread");
        Thread t2 = new Thread(() -> printer.printEven(), "Even-Thread");

        t1.start();
        t2.start();
//        Reenterant Lock
        System.out.println("Reenternant Lock");
        LockPrinter reenterantPrinter = new LockPrinter();
        Thread t3 = new Thread(() -> reenterantPrinter.printOdd(), "Odd-Thread");
        Thread t4 = new Thread(() -> reenterantPrinter.printEven(), "Even-Thread");

        t3.start();
        t4.start();

//        Semaphore
        System.out.println("Semaphore Lock");
        SemaphorePrinter semaphorePrinter = new SemaphorePrinter();
        Thread t5 = new Thread(() -> semaphorePrinter.printOdd(), "Odd-Thread");
        Thread t6 = new Thread(() -> semaphorePrinter.printEven(), "Even-Thread");

        t5.start();
        t6.start();

//        AtomicInteger
        System.out.println("Atomic Integer multiThread");
        AtomicPrinter atomicPrinter = new AtomicPrinter();

        Thread t7 = new Thread(() -> atomicPrinter.printOdd(), "Odd-Thread");
        Thread t8 = new Thread(() -> atomicPrinter.printEven(), "Even-Thread");

        t7.start();
        t8.start();

    }
}
class NumberPrinter{
    private int number=1;
    private final int Max=10;

    public synchronized void printOdd(){
        while(number<=Max){
            if(number%2 ==1){
                System.out.println(Thread.currentThread().getName()+" : "+number);
                number++;
                notify();
            }else{
                try{
                    wait();
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        }

    }

    public synchronized void printEven() {
        while (number<=Max){
            if(number%2==0){
                System.out.println(Thread.currentThread().getName()+" : "+number);
                number++;
                notify();
            }else{
                try{
                    wait();
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

class LockPrinter {

    private int number = 1;
    private final int MAX = 10;

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public void printOdd() {
        lock.lock();
        try {
            while (number <= MAX) {
                while (number % 2 == 0) {
                    condition.await();
                }
                System.out.println(Thread.currentThread().getName() + " : " + number++);
                condition.signal();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public void printEven() {
        lock.lock();
        try {
            while (number <= MAX) {
                while (number % 2 == 1) {
                    condition.await();
                }
                System.out.println(Thread.currentThread().getName() + " : " + number++);
                condition.signal();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }
}
class SemaphorePrinter {

    private static final int MAX = 10;

    private final Semaphore oddSem = new Semaphore(1);
    private final Semaphore evenSem = new Semaphore(0);

    public void printOdd() {
        for (int i = 1; i <= MAX; i += 2) {
            try {
                oddSem.acquire();
                System.out.println(Thread.currentThread().getName() + " : " + i);
                evenSem.release();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void printEven() {
        for (int i = 2; i <= MAX; i += 2) {
            try {
                evenSem.acquire();
                System.out.println(Thread.currentThread().getName() + " : " + i);
                oddSem.release();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
class AtomicPrinter {

    private static final int MAX = 10;
    private AtomicInteger number = new AtomicInteger(1);

    public void printOdd() {
        while (number.get() <= MAX) {
            if (number.get() % 2 == 1) {
                System.out.println(Thread.currentThread().getName() + " : " + number.getAndIncrement());
            }
        }
    }

    public void printEven() {
        while (number.get() <= MAX) {
            if (number.get() % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " : " + number.getAndIncrement());
            }
        }
    }
}
