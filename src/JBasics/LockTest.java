package JBasics;

import java.util.concurrent.locks.ReentrantLock;

class Window implements Runnable{

    private Integer ticket = 100;

    private ReentrantLock lock= new ReentrantLock(true);

    public void run() {
        while (true){
            try {
                lock.unlock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ":selling tickets" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                lock.unlock();
            }



        }

    }
}

public class LockTest {

    public static void main(String[] args) {

    }
}
