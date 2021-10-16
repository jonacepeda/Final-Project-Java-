package Data;

public class Student extends Person {
    private static int universalID = 0;
    private int id;
    private int age;

    public Student(String name, int age) {
        super(name);
        universalID += 1;
        this.id = universalID;
        this.age = age;

    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void showInfo() {

    }
    @Override
    public String toString(){
        return " |ID: "+ this.id +" | "+ this.name +  " | Age: " + this.age + " |\n";
    }
}
