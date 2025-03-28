package com.bridgelabz.mealplanner;

import java.util.ArrayList;

class MealPlanner {
    private ArrayList<Meal<? extends MealPlan>> meals = new ArrayList<>();

    public void addMealPlan(Meal<? extends MealPlan> meal) {
        meals.add(meal);
    }

    public void displayMealPlans() {
        for(Meal<? extends MealPlan> meal:meals) {
            meal.displayMealDetails();
        }
    }
}
