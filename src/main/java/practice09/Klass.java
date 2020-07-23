package practice09;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void assignLeader(Student student){
        if (student.getKlass().getNumber()!=this.getNumber()){
            System.out.println("It is not one of us.");
            return;
        }

        this.leader = student;
    }

    public String getDisplayName(){
        return "Class "+ this.getNumber();
    }

    public void appendMember(Student student){
        student.getKlass().setNumber(this.getNumber());
    }
}
