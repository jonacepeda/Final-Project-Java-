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
}
