package Data;


import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Teachers> teachersList;
    private List<SchoolClasses> schoolClassesList;
    private List<Student> generalStudentList;

    public University(){
        this.teachersList = new ArrayList<>();
        this.schoolClassesList = new ArrayList<>();
        this.generalStudentList = new ArrayList<>();
    }

    public List<Teachers> getTeachersList() {
        return teachersList;
    }

    public void setTeachersList(Teachers teacher) {
       teachersList.add(teacher);
    }

    public List<SchoolClasses> getSchoolClassesList() {
        return schoolClassesList;
    }
    public Teachers assignTeacher(int index) {
        return teachersList.get(index);
    }

    public void setSchoolClassesList(SchoolClasses classes) {
        schoolClassesList.add(classes);
    }
    public List<Student> getStudentList() {
        return generalStudentList;
    }

    public void communityCreation(){
        this.setTeachersList(new FullTimeTeacher("Ana Alegria",4000, 4, 40 ));
        this.setTeachersList(new FullTimeTeacher("Pepito Perez",2000, 1, 40 ));
        this.setTeachersList(new PartTimeTeacher("Juan Tanamera",4000, 4, 40 ));
        this.setTeachersList(new PartTimeTeacher("Ali Cate",2000, 1, 40 ));

        this.setSchoolClassesList(new SchoolClasses("Math", "405", assignTeacher(0)));
        this.setSchoolClassesList(new SchoolClasses("English", "402", assignTeacher(1)));
        this.setSchoolClassesList(new SchoolClasses("Spanish", "101", assignTeacher(2)));
        this.setSchoolClassesList(new SchoolClasses("Computation Science", "203", assignTeacher(3)));

        this.getStudentList().add(new Student("Rafa Gorgory", 20));
        this.getStudentList().add(new Student("Bar Sinson", 22));
        this.getStudentList().add(new Student("Karl Smith", 21));
        this.getStudentList().add(new Student("Wendy Sulca", 28));
        this.getStudentList().add(new Student("Ivan Duque", 45));
        this.getStudentList().add(new Student("Teresa Suarez", 33));

        this.getSchoolClassesList().get(0).studentToClass(getStudentList().get(0));
        this.getSchoolClassesList().get(0).studentToClass(getStudentList().get(1));
        this.getSchoolClassesList().get(1).studentToClass(getStudentList().get(2));
        this.getSchoolClassesList().get(1).studentToClass(getStudentList().get(3));
        this.getSchoolClassesList().get(2).studentToClass(getStudentList().get(4));
        this.getSchoolClassesList().get(2).studentToClass(getStudentList().get(5));
        this.getSchoolClassesList().get(3).studentToClass(getStudentList().get(0));
        this.getSchoolClassesList().get(3).studentToClass(getStudentList().get(1));

    }
}
