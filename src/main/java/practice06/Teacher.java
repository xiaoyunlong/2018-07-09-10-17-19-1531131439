package practice06;

public class Teacher extends Person{
    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public String introduce(){
        if (this.getKlass() != 0){
            return super.introduce()+" I am a Teacher. I teach Class "+this.getKlass()+".";
        }
<<<<<<< HEAD
        return super.introduce()+" I am a Teacher. I teach No Class.";
=======
        return super.introduce()+"I am a Teacher. I teach No Class.";
>>>>>>> cd20a118b7ff45981b792ff44f1e1fcff5cca2bb
    }
}
