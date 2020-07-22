package practice07;

public class Person {
    protected String name;
    protected int age;
    protected Klass klass;

    public Person(String name, int age, Klass klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Klass getKlass() {
        return klass;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String introduce(){
        return "My name is "+this.getName() + ". I am "+ this.getAge()+" years old.";
    }
}
