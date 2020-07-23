package practice08;

public class Student extends Person{
    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age, klass);
    }
    public String introduce(){
        if(this.getKlass().getLeader()!=null&&this.equals(this.getKlass().getLeader())){
            return super.introduce() + " I am a Student. I am Leader of Class "+super.getKlass().getNumber()+".";
        }
        return super.introduce() + " I am a Student. I am at Class "+super.getKlass().getNumber()+".";

    }


}
