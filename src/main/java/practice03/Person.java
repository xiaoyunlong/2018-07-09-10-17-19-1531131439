package practice03;

public class Person {
    protected String name;
    protected int age;

    public Person(String name,int age) {
        this.age = age;
        this.name = name;
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
