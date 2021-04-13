public class Person {
    private String name;
    public int age;

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
