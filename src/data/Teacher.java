package data;

public class Teacher extends User{
    String discipline;
    public Teacher(String name, String lastName, String dateOfBirth, String discipline) {
        super(name, lastName, dateOfBirth);
        this.discipline = discipline;
    }
    public Teacher(){}

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "discipline='" + discipline + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
