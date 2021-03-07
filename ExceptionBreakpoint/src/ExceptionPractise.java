public class ExceptionPractise {
    public static void main(String[] args) {
        try {
            if (1 > 0) {
                System.out.println("2");
            }
            Somewhere.doSomething(0);
            if (1 > 0) {
                System.out.println("2");
            }
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
