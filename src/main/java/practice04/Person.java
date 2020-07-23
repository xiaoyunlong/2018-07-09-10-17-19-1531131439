package practice04;

public class Person {
    protected String name;
    protected int age;
    protected String basicIntroduce;


    public Person(String name,int age) {
        this.age = age;
        this.name = name;
        this.basicIntroduce = "My name is "+name + ". I am "+ age +" years old.";
    }

    public String getBasicIreduce() {
        return basicIntroduce;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String introduce(){
        return getBasicIreduce();
    }
}
