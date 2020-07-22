package practice07;

public class Teacher extends Person{
    public Teacher(String name, int age, Klass klass) {
        super(name, age, klass);
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public String introduce(){
        if (this.getKlass() != null){
            return super.introduce()+" I am a Teacher. I teach Class "+this.getKlass().getNumber()+".";
        }
        return super.introduce()+" I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student){
        if(student.getKlass().getNumber() == this.getKlass().getNumber()){
            return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }
        return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
    }

}
