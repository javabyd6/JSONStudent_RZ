package pl.sda.readstudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Remigiusz Zudzin
 */
public class Main {

    private static ObjectMapper mapper = new ObjectMapper();

    private static void readStudentJSONList() {

        try {
            Student[] studentArray = mapper.readValue(new File("studentList.json"), Student[].class);
            List<Student> readStudentArray = Arrays.asList(studentArray);
            System.out.println(readStudentArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readStudentJSONListStartingWithA() {
        try {
            Student[] studentArray = mapper.readValue(new File("studentList.json"), Student[].class);
            List<Student> readStudentArray = Arrays.asList(studentArray);
            Stream<Student> namesStartingWithA = readStudentArray.stream()
                    .filter(x -> x.getName().startsWith("A"));
            System.out.println(namesStartingWithA.collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readStudentJSONList();
        readStudentJSONListStartingWithA();
    }

}
