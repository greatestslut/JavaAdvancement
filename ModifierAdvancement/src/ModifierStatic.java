import com.sun.xml.internal.ws.resources.UtilMessages;

public class ModifierStatic {
    private int number = 1;
    //When you say something is static, it means the field or
    //method is not tied to any particular object instance.
    //because the method is static , I guess there is no bond
    //between the instance and the method
    //   for two parts : 1. field --> the value of the very field
    //           is that very abstract
    //           2.method --> the logic of the very method is pretty
    //           abstract
    //           My understanding is that static is a very abstract part in
    //           pure OOP language

    public static void main(String[] args) {
        int value = multiadd(1, 1, 1, 1);

        System.out.println(value);
    }

    public void test() {
        number = multiadd(1, 1, 1, 1);
    }

    public static int multiadd(int num1, int num2, int num3, int num4) {
        return multiply(add(num1, num2), add(num3, num4));
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}
