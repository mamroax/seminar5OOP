package controller;

import data.Group;
import data.Student;
import data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private static List<Group> stream = new ArrayList<>();


    @Override
    public String toString() {
        return "Controller{}" + stream;
    }

    public void addGroup(Group group) {
        stream.add(group);
    }

    public static void setStream(List<Group> stream) {
        Controller.stream = stream;
    }

    public static List<Group> getStream() {
        return stream;
    }

    public static Group getGroupById(Integer id) {
        for (Group group : stream) {
            if (group.getId() == id) {
                return group;
            }
        }
        System.out.println("Такой группы нет");
        return null;
    }


    public void addStudent(Integer idGroup, String name, String lastName, String dateOfBirth, Integer id) {
        getGroupById(idGroup).addStudent(new Student(name, lastName, dateOfBirth, id));
    }

    public void addTeacherToGroup(Integer idGroup, String name, String lastName, String dateOfBirth, String discipline) {
        getGroupById(idGroup).createTeacher(name, lastName, dateOfBirth, discipline);
    }
}
