public class WIndow1 implements Runnable{

    private Integer ticket = 100;

    @Override
    public void run() {
        while (true){
            synchronized (ticket) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ":selling tickets" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }

        }

    }
}
