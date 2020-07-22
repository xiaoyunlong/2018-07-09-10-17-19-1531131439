package practice01;

public class Person {
    private String name;
    private int age;

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

    public void introduceSelf(){
        System.out.println("My name is"+this.getName() + ".I am +"+ this.getAge()+"years old");
    }
}
