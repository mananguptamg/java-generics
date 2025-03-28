package com.bridgelabz.resumescreening;

import java.util.ArrayList;

// Class to handle multiple job roles in screening pipeline using generic and wildcard method
public class ScreeningPipeline {
    private ArrayList<Resume<? extends JobRole>> resumes = new ArrayList<>();

    public void addResume(Resume<? extends JobRole> resume) {
        resumes.add(resume);
    }

    public void displayResumes() {
        for(Resume<? extends JobRole> resume:resumes) {
            resume.displayJobDetails();
        }
    }
}