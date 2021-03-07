package ImplSelling;

public class Window{
    public static void main(String[] args) {
        Selling s1 = new Selling();

        Thread w1 = new Thread(s1);
        Thread w2 = new Thread(s1);
        Thread w3 = new Thread(s1);
        w1.setName("yyy");
        w2.setName("eee");
        w3.setName("sss");
        w1.start();
        w2.start();
        w3.start();
    }
}
