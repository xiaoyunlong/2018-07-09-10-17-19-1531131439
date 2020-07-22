package practice02;

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
<<<<<<< HEAD
        return "My name is "+this.getName() + ". I am "+ this.getAge()+" years old.";

=======
        return "My name is"+this.name + ".I am +"+ this.age+"years old";
>>>>>>> cd20a118b7ff45981b792ff44f1e1fcff5cca2bb

    }
}
