import View.View;
import data.Group;
import data.Student;
import data.Teacher;

import java.util.ArrayList;
import java.util.List;

/** 1. Создать package – data. Работу продолжаем в нем
 2. Реализовать абстрактный класс User и его наследники Student и Teacher.
 Родитель имеет в себе общие данные (пример: фио, год рождения и тд),
 а наследники собственные параметры (какие, по выбору преподавателя –
 Пример: studentId для Student, disciplesTaught для Teacher).
 3. После этого проговорить со студентами важность снижения дублирования
 кода и легкость управления структурой данных (в том числе, создание
 необходимого числа корректных конструкторов) и добавления новых сущностей
 путем наследования от абстрактного класса*/

/**
 * 1. Создать package – controller. Работу продолжаем в нем +
 * 2. Создать класс Controller агрегирующий в себе необходимые классы в виде полей,
 * а инициализируем прям в поле. +
 * 3. Создаем метод созданиеСтудента – реализующий логику, путем вызова соответствующих
 * методов интерфейсов: +
 *     1. Создания Студента в сервисе +
 *     2. Возвращение всех студентов в сервисе +
 *     3. Вызов view и передача списка найденных студентов */

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Student student = new Student("Артем", "Артемов", "08.10.2007", 1);
        Student student1 = new Student("Игорь", "Артемов", "08.10.2007", 2);
        Student student2 = new Student("Илья", "Артемов", "08.10.2007", 3);
        Student student4 = new Student("Григорий", "Артемов", "08.10.2007", 4);
//        Student student5 = new Student("Василий", "Артемов", "08.10.2007", 5);
        view.createGroup(new Group(new ArrayList<>(List.of(student1, student2, student, student4)),
                new Teacher("Иван",  "Иванов",
                        "08.10.1977", "Математика"), 10));
        view.createStudent(10, "Василий", "Артемов", "08.10.2007", 5);
        view.printInfo();
    }
}