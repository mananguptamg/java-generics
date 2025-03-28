package com.bridgelabz.mealplanner;

class Meal<T extends MealPlan> {
    private T mealType;

    Meal(T mealType) {
        this.mealType = mealType;
    }

    public T getMealType() {
        return mealType;
    }

    public void displayMealDetails() {
        System.out.println(mealType.getMealDetails());
    }
}
