package com.bridgelabz.resumescreening;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        // Create objects of resume for different roles
        Resume<SoftwareEngineer> seResume = new Resume<>("Amit Kumar", new SoftwareEngineer());
        Resume<DataScientist> dsResume = new Resume<>("Jitesh Sharma", new DataScientist());
        Resume<ProductManager> pmResume = new Resume<>("Robin Singh", new ProductManager());

        // Create object of screening pipeline
        ScreeningPipeline pipeline = new ScreeningPipeline();
        pipeline.addResume(seResume);
        pipeline.addResume(dsResume);
        pipeline.addResume(pmResume);

        System.out.println("--- AI-Driven Resume Screening ---");
        pipeline.displayResumes();
    }
}
