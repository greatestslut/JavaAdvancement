import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {

    @Test
    public void beforeReflectionTest() {
        //constructor
        Person person = new Person("Bryan", 24);

        //field
        person.age = 10;

        //method
        int age = person.getAge();
    }

    @Test
    public void sinceReflectionTest() throws Exception {
        Class clazz = Person.class;
        Constructor cons = clazz.getConstructor(String.class, int.class);

        //constructor by reflection
        Person person = (Person) cons.newInstance("Bryan", 24);
        //field
        Field age = clazz.getDeclaredField("age");
        age.set(person, 10);
        //method
        Method getAge = clazz.getDeclaredMethod("getAge");
        getAge.invoke(person);


        //private part
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        //constructor
        Person person1 = (Person) constructor.newInstance();
        System.out.println(person1);
        //field
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person1, "bryan");
        //method
        Method getName = clazz.getDeclaredMethod("getName");
        getAge.setAccessible(true);
        int age1 = (int) getAge.invoke(person1);
        System.out.println(age1);
    }







}
