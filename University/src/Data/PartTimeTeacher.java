package Data;

public class PartTimeTeacher extends Teachers{


    public PartTimeTeacher(String name, float baseSalary, int experience, int hoursPerWeek) {
        super(name, baseSalary, experience, hoursPerWeek);
    }

    float getSalary() {
        return (float) (baseSalary * hoursPerWeek);
    }
    @Override
    public String toString(){
        return "Name: " + this.name + " | Salary: $" + getSalary() + " | Experience in years: " + this.experience + " | Hours per week: "+ this.hoursPerWeek + " | Modality: Part time"+"\n";
    }
}
