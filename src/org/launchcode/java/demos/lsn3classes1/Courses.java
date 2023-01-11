package org.launchcode.java.demos.lsn3classes1;

import java.time.LocalDate;

public class Courses {
    private String instructor;
    private String department;
    private final int courseNumber;
    private int credits;
    private int capacity;
    private String semester;
    private LocalDate startDate;

    //constructor

    public Courses(String instructor, String department, int courseNumber, int credits, int aCapacity, String aSemester, LocalDate aStartDate){
        this.instructor = instructor;
        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.capacity = aCapacity;
        this.semester = aSemester;
        this.startDate = aStartDate;
    }

    public int getCourseNumber(){
        return courseNumber;
    }

    public String getSemester(){
        return semester;
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

    public void setInstructor(String instructor){
        this.instructor = instructor

    }

}
