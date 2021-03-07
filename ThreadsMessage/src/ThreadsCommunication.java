/**
 * The threads communication:two threads alternatively print the number within 1~100
 */

class PrintNum implements Runnable{
    private int num = 1;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                obj.notify();
                if (num <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + num);
                    num++;
                    // let this thread suspend
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}

public class ThreadsCommunication {
    public static void main(String[] args) {
        PrintNum printNum = new PrintNum();
        // initiate two threads
        Thread t1 = new Thread(printNum);
        Thread t2 = new Thread(printNum);

        t1.setName("No.1");
        t2.setName("No.2");

        t1.start();
        t2.start();

    }
}
