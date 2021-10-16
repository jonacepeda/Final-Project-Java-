package Data;

abstract class Teachers extends Person{
    float baseSalary;
    int experience;
    int hoursPerWeek;

    protected Teachers(String name, float baseSalary, int experience, int hoursPerWeek) {
        super(name);
        this.baseSalary = baseSalary;
        this.experience = experience;
        this.hoursPerWeek = hoursPerWeek;

    }


    abstract float getSalary();

}
