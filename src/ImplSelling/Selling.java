package ImplSelling;

/**
 *
 */
public class Selling implements Runnable{

    private Integer ticketNum = 100;

    @Override
    public void run() {
        while (ticketNum > 0){
            System.out.println(Thread.currentThread().getName() +"：买票，票号为" + ticketNum);
            ticketNum--;

        }

    }
}
