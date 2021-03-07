import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Bird b = new Bird();
        Come(b);
        ArrayList arrayList = new ArrayList();

    }

    public static void Come(Animal animal) {
        animal.run();
    }
}
