package com.bridgelabz.mealplanner;

public class MealSystem {
    public static void main(String[] args) {
        // Create objects of meal with different meal types
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<HighProteinMeal> highProteinMeal = new Meal<>(new HighProteinMeal());

        // Create an object of MealPlanner to add different types of meal into planner
        MealPlanner planner = new MealPlanner();
        planner.addMealPlan(vegMeal);
        planner.addMealPlan(veganMeal);
        planner.addMealPlan(highProteinMeal);

        // Display meal types details
        System.out.println("--- Personalized Meal Plans ---");
        planner.displayMealPlans();
    }
}