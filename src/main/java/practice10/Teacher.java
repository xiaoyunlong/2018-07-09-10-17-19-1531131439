package practice10;

public class Teacher extends Person{
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age, klass);
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

    public boolean isTeaching(Student student){
        if(student.getKlass().isIn(student)){
            return true;
        }
        return false;
    }
}
