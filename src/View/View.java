package View;

import controller.Controller;
import data.Group;
import data.Student;

public class View {
    Controller controller = new Controller();
    public void createGroup(Group group){
        controller.addGroup(group);
    }

    public void createStudent(Integer groupId, String name, String lastName, String dateOfBirth, Integer id){
        controller.addStudent( groupId, name,  lastName,  dateOfBirth,  id);
    }

    public void printInfo(){
        System.out.println(controller);
    }
}
