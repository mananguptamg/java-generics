package com.bridgelabz.universitymanagementsystem;

public class CourseSystem {
    public static void main(String[] args) {
        // Create objects of course class with different course types
        Course<ExamCourse> math = new Course<>(new ExamCourse("M122", "mathematics", "Dr. Amit"));
        Course<AssignmentCourse> cs = new Course<>(new AssignmentCourse("C123", "Computer Science", "Prof. Verma"));
        Course<ResearchCourse> physics = new Course<>(new ResearchCourse("P124", "Quantum Mechanics", "Dr. Lokesh"));

        // Create an object of course catalog and add courses in it
        CourseCatalog catalog = new CourseCatalog();
        catalog.addCourse(math);
        catalog.addCourse(cs);
        catalog.addCourse(physics);

        // Display courses and details
        System.out.println("--- University Course Catalog ---");
        catalog.displayCourses();
    }
}