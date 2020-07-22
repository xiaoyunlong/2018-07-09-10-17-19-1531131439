package practice05;

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
        return super.introduce() + "I am a student. I am at class"+this.getKlass()+".";
    }
}
