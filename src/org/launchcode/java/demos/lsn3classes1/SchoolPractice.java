package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {

        Student Louisa = new Student("Louisa", 1234, 5, 2.7);

        double Louisa_gpa = Louisa.getGpa();
        System.out.println(Louisa.getName());

        System.out.println(Louisa_gpa);
    }
}
