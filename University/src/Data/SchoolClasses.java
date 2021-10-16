package Data;

import java.util.ArrayList;
import java.util.List;

public class SchoolClasses {
    private String subjectName;
    private String classRoom;

    private Teachers assignedTeacher;

    private List<Student> studentsList;

    public String getSubjectName() {
        return subjectName;
    }

    public SchoolClasses(String subjectName, String classRoom, Teachers assignedTeacher){
        studentsList = new ArrayList<>();
        this.subjectName = subjectName;
        this.classRoom = classRoom;
        this.assignedTeacher = assignedTeacher;
    }

    public void studentToClass(Student student){
        studentsList.add(student);

    }

    public String getAssignedTeacher() {
        return assignedTeacher.name;
    }
    public List<Student> getStudentsList() {
        return studentsList;
    }
    @Override
    public String toString(){
        return "Subject: " + this.subjectName + " | Assigned Classroom: " + this.classRoom;
    }
}
