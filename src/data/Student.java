package data;

public class Student extends User{
    Integer id;
    public Student(String name, String lastName, String dateOfBirth, Integer id){
        super(name, lastName, dateOfBirth);
        this.id = id;
    }
    public Student(){}

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
