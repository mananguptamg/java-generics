package com.bridgelabz.mealplanner;

interface MealPlan {
    String getMealDetails();
}

class VegetarianMeal implements MealPlan {
    public String getMealDetails() {
        return "Vegetarian Meal: Rich in vegetables, grains, and legumes.";
    }
}

class VeganMeal implements MealPlan {
    public String getMealDetails() {
        return "Vegan Meal: No animal products, includes plant-based proteins.";
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealDetails() {
        return "High-Protein Meal: Focus on lean meats, eggs, and legumes.";
    }
}