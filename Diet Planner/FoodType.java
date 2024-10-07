/**
 * File: FoodType
 * By: Ghaida
 * Date: 18/09/2024
 * Description: FoodType Class represents types of food with its nutritional values.
 */
//Holds food types as Strings and nutrient amount as doubles
class FoodType {
    private String name; // name of the food
    private double calories; // calories per serving
    private double protein; // protein per serving
    private double fiber; // fiber per serving

    public FoodType(String name, double calories, double protein, double fiber) {
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.fiber = fiber;
    }

    //getters for nutrients
    public String getname() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public double getProtein() {
        return protein;
    }

    public double getFiber() {
        return fiber;
    }

    @Override // Overriden to toString() method for  display of food items
    public String toString() {
        return name + ":" + calories + "calories, " + protein + "g protein, " + fiber + "g fiber";
    }
}