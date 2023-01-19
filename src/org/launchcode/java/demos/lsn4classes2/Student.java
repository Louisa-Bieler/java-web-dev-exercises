package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }



    public String getGradeLevel() {

        if (this.getNumberOfCredits() <= 29){
            String freshman = "Freshman";
            return freshman;
        } else if (this.getNumberOfCredits() <= 59) {
            String sophomore = "Sophomore";
            return sophomore;
        } else if (this.getNumberOfCredits() <= 89) {
            String junior = "Junior";
            return junior;
        } else {
            String senior = "Senior";
            return senior;
        }
    }


    public void addGrade(int courseCredits, double grade) {
        double currentQualityScore = this.getGpa() * this.getNumberOfCredits();
        double totalQualityScore = currentQualityScore + courseCredits*grade;
        this.setNumberOfCredits(this.getNumberOfCredits()+courseCredits);
        this.setGpa(totalQualityScore/this.getNumberOfCredits());
    }

    @Override
    public String toString() {
        String prettyPrint = String.format("%s is a %s with %d credits and a GPA of %.2f.", this.name, this.getGradeLevel(), this.numberOfCredits, this.gpa);
        return prettyPrint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStudentId() == student.getStudentId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId());
    }




    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,35,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}
