package practice04;

public class Student extends Person{
    private int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce(){
<<<<<<< HEAD
        return  super.getBasicIreduce()+ " I am a Student. I am at Class "+ this.getKlass()+".";
=======
        return  super.getBasicIreduce()+ "I am a Student. I am at Class +"+ this.getKlass()+".";
>>>>>>> cd20a118b7ff45981b792ff44f1e1fcff5cca2bb

    }
}
