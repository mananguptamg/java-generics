package com.bridgelabz.universitymanagementsystem;

import java.util.ArrayList;

class CourseCatalog {
    private ArrayList<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void displayCourses() {
        for(Course<? extends CourseType> course:courses) {
            course.displayCourse();
        }
    }
}