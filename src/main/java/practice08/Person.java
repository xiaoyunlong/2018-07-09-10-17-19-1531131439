package practice08;

public class Person {
    protected int id;
    protected String name;
    protected int age;
    protected Klass klass;

    public Person(int id, String name, int age, Klass klass) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public Klass getKlass() {
        return klass;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String introduce(){
        return "My name is "+this.getName() + ". I am "+ this.getAge()+" years old.";
    }

    @Override //不能修改参数列表
    public boolean equals(Object obj) {
       if(this.getId() == ((Person)obj).getId()){
           return true;
       }
       return false;
    }


}
