package practice05;

public class Worker extends Person{
    public Worker(String name, int age) {
        super(name, age);
    }

    public String introduce(){
<<<<<<< HEAD
        return super.introduce() + " I am a Worker. I have a job.";
=======
        return super.introduce() + "I am a Worker. I have a job.";
>>>>>>> cd20a118b7ff45981b792ff44f1e1fcff5cca2bb
    }
}
