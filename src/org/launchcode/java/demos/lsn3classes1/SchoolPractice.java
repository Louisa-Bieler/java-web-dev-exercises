package org.launchcode.java.demos.lsn3classes1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.LocalDate.now;

public class SchoolPractice {
    public static void main(String[] args) {

        Student Louisa = new Student("Louisa", 1234, 5, 2.7);
        Student Simon = new Student("Simon", 1324, 6, 4.0);

        double Louisa_gpa = Louisa.getGpa();
        System.out.println(Louisa.getName());

        System.out.println(Louisa_gpa);

        ArrayList<Student> javaCourseEnrollment = new ArrayList<Student>();

        Courses javaCourse = new Courses("Ms. Frizzle", "CS", 101, 2, 2, LocalDate.now());

        javaCourse.setStudents(Louisa);
        javaCourse.setStudents(Simon);

        System.out.print(javaCourse.getCapacity() + System.lineSeparator());
        javaCourse.getStudentNames(javaCourse);


    }
}
