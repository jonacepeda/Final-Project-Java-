package Data;

public class FullTimeTeacher extends Teachers{


    public FullTimeTeacher(String name, float baseSalary, int experience, int hoursPerWeek) {
        super(name, baseSalary, experience, hoursPerWeek);
    }

    float getSalary() {
        return (float) (baseSalary * (hoursPerWeek * 1.1));
    }


    @Override
    public String toString(){
        return "Name: " + this.name + " | Salary: $" + getSalary() + " | Experience in years: " + this.experience + " | Hours per week: "+ this.hoursPerWeek + " | Modality: Full time"+"\n";
    }
}
