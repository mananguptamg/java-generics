package com.bridgelabz.universitymanagementsystem;

class Course<T extends CourseType> {
    private final T courseType;

    Course(T courseType) {
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public void displayCourse() {
        courseType.displayCourseDetails();
    }
}