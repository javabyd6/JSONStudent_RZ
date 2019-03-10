package pl.sda.savestudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Remigiusz Zudzin
 */
public class SaveStudentMain {

    private static ObjectMapper mapper = new ObjectMapper();

    private static void createStudentJSONList() {
        Student student1 = new Student("Adam", "Nowak", 1);
        Student student2 = new Student("Tomasz", "Kowalski", 2);
        Student student3 = new Student("Anna", "Zalewska", 3);
        Student student4 = new Student("Remigiusz", "Zudzini", 4);
        Student student5 = new Student("Katarzyna", "Rominska", 5);
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);
        listOfStudents.add(student5);

        try {
            mapper.writeValue(new File("studentList.json"), listOfStudents);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        createStudentJSONList();
    }

}
