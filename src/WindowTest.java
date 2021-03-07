public class WindowTest {
    public static void main(String[] args) {
        WIndow1 w = new WIndow1();

        Thread t1 = new Thread(w, "1");
        Thread t2 = new Thread(w, "2");
        Thread t3 = new Thread(w, "3");
        

        t1.start();
        t2.start();
        t3.start();

    }
}
