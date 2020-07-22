package practice04;

public class Person {
    protected String name;
    protected int age;
    protected String basicIreduce;

    public Person(String name,int age) {
        this.age = age;
        this.name = name;
    }

    public String getBasicIreduce() {
        return basicIreduce;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String introduce(){
        this.basicIreduce = "My name is"+this.name + ".I am +"+ this.age+"years old";
        return getBasicIreduce();
    }
}
