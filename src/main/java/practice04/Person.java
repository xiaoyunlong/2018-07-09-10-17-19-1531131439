package practice04;

public class Person {
    protected String name;
    protected int age;
<<<<<<< HEAD
    protected String basicIntroduce;
=======
    protected String basicIreduce;
>>>>>>> cd20a118b7ff45981b792ff44f1e1fcff5cca2bb

    public Person(String name,int age) {
        this.age = age;
        this.name = name;
<<<<<<< HEAD
        this.basicIntroduce = "My name is "+name + ". I am "+ age +" years old.";
    }

    public String getBasicIreduce() {
        return basicIntroduce;
=======
    }

    public String getBasicIreduce() {
        return basicIreduce;
>>>>>>> cd20a118b7ff45981b792ff44f1e1fcff5cca2bb
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String introduce(){
<<<<<<< HEAD
=======
        this.basicIreduce = "My name is"+this.name + ".I am +"+ this.age+"years old";
>>>>>>> cd20a118b7ff45981b792ff44f1e1fcff5cca2bb
        return getBasicIreduce();
    }
}
