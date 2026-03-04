package multithreading;

public class PrintA_ZWithTwoThread {
    public static void main(String[] args) {
        AlphabetPrinter printer = new AlphabetPrinter();

        Thread t1 = new Thread(printer::printT1, "T1");
        Thread t2 = new Thread(printer::printT2, "T2");

        t1.start();
        t2.start();
    }
}
class AlphabetPrinter {

    private char ch = 'a';
    private boolean isT1Turn = true;

    public synchronized void printT1() {
        while (ch <= 'z') {
            while (!isT1Turn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            if (ch <= 'z') {
                System.out.println(Thread.currentThread().getName() + " : " + ch++);
            }

            isT1Turn = false;
            notify();
        }
    }

    public synchronized void printT2() {
        while (ch <= 'z') {
            while (isT1Turn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            if (ch <= 'z') {
                System.out.println(Thread.currentThread().getName() + " : " + ch++);
            }

            isT1Turn = true;
            notify();
        }
    }
}
