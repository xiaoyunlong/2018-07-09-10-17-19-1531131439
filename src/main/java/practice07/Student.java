package practice07;

public class Student extends Person{


    public Student(String name, int age, Klass klass) {
        super(name, age, klass);
    }

    public String introduce(){
        return super.introduce() + " I am a Student. I am at Class "+super.getKlass().getNumber()+".";

    }


}
