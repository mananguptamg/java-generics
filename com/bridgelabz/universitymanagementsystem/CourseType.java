package com.bridgelabz.universitymanagementsystem;

abstract class CourseType {
    private final String courseCode;
    private final String courseName;
    private final String instructor;

    CourseType(String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void displayCourseDetails() {
        System.out.println("Course Code: " + courseCode + "| Course Name: " + courseName + " by " + instructor);
    }
}

class ExamCourse extends CourseType {
    ExamCourse(String courseCode, String courseName, String instructor) {
        super(courseCode, courseName, instructor);
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String courseCode, String courseName, String instructor) {
        super(courseCode, courseName, instructor);
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String courseCode, String courseName, String instructor) {
        super(courseCode, courseName, instructor);
    }
}