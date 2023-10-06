package data;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> studentsList;
    private Teacher teacher = new Teacher();
    private Student student = new Student();

    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Group(){}

    public Group(ArrayList<Student> studentsList, Teacher teacher, Integer id){
        this.studentsList = studentsList;
        this.id = id;
        this.teacher = teacher;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public void addStudent(Student student){
        this.studentsList.add(student);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    @Override
    public String toString() {
        return "Group{" +
                "studentsList=" + studentsList +
                ", teacher=" + teacher +
                ", id group=" + id +
                '}';
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void createStudent(String name, String lastName, String dateOfBirth, Integer id){
        student.setId(id);
        student.setName(name);
        student.setLastName(lastName);
        student.setDateOfBirth(dateOfBirth);
    }

    public void createTeacher(String name, String lastName, String dateOfBirth, String discipline){
        teacher.setDiscipline(discipline);
        teacher.setName(name);
        teacher.setLastName(lastName);
        teacher.setDateOfBirth(dateOfBirth);
    }
}
