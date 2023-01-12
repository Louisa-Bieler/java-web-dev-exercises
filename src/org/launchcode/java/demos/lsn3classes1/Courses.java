package org.launchcode.java.demos.lsn3classes1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Courses {
    private String instructor;
    private String department;
    private final int courseNumber;
    private int credits;
    private int capacity;
    private ArrayList<Student> students = new ArrayList<Student>();
    private LocalDate startDate;

    //constructor

    public Courses(String instructor, String department, int courseNumber, int credits, int capacity, LocalDate startDate){
        this.instructor = instructor;
        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.capacity = capacity;
        this.startDate = startDate;
    }



    public int getCourseNumber(){
        return courseNumber;
    }

    public String getInstructor(){
        return instructor;
    }

    public String getDepartment(){
        return department;
    }
    public int getCredits(){
        return credits;
    }

    public int getCapacity(){
        return capacity;
    }

    public LocalDate getStartDate(){
        return startDate;
    }

    public void setInstructor(String aInstructor){
        this.instructor = aInstructor;

    }

    public void setStudents(Student aStudent){
        this.students.add(aStudent);
    }

    public ArrayList<Student> getStudents() {
        return students;

        }

    public void getStudentNames(Courses aCourse){
        ArrayList<Student> students = (aCourse.getStudents());
        String student = null;
        String newline = System.lineSeparator();
        for (Student aStudent : students) {
            System.out.print(aStudent.getName() + newline);
        }
    }
    }
