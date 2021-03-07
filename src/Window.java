public class Window extends Thread{

    private static Integer ticketNumber = 100;
    @Override
    public void run() {
        while (ticketNumber > 0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() +"：买票，票号为" + ticketNumber);
            ticketNumber--;

    }
    }
}
