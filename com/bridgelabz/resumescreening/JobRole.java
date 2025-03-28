package com.bridgelabz.resumescreening;

abstract class JobRole {
    // Attributes
    private final String roleName;
    private final String skillsRequired;

    // Constructor
    JobRole(String roleName, String skillsRequired) {
        this.roleName = roleName;
        this.skillsRequired = skillsRequired;
    }

    // getter methods to get roleName and skillsRequired
    public String getRoleName() {
        return roleName;
    }

    public String getSkillsRequired() {
        return skillsRequired;
    }

    // abstract method
    abstract void getRoleDetails();

    // method to display role details
    public void displayRoleDetails() {
        System.out.println("Role: " + roleName);
        System.out.println("Skills Required: " + skillsRequired);
    }
}

// Subclass -> SoftwareEngineer
class SoftwareEngineer extends JobRole {
    SoftwareEngineer() {
        super("Software Engineer", "Strong coding and problem-solving skills");
    }

    @Override
    public void getRoleDetails() {
        System.out.println("Software Engineer: Requires strong coding and problem-solving skills.");
    }
}

// Subclass -> DataScientist
class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist", "Expertise in machine learning.");
    }

    @Override
    public void getRoleDetails() {
        System.out.println("Data Scientist: Requires expertise in machine learning.");
    }
}

// Subclass -> ProductManager
class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager", "Strategic thinking");
    }

    @Override
    public void getRoleDetails() {
        System.out.println("Product Manager: Requires strategic thinking.");
    }
}
