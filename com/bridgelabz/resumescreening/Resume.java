package com.bridgelabz.resumescreening;

class Resume<T extends JobRole> {
    private String name;
    private T jobRole;

    Resume(String name, T jobRole) {
        this.name = name;
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public String getName() {
        return name;
    }

    public void displayJobDetails() {
        System.out.println("Name: " + name);
        jobRole.getRoleDetails();
    }
}
