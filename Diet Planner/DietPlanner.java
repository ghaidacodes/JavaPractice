import java.util.Scanner;

/**
 * File: FoodType
 * By: Ghaida
 * Date:23/09/2024
 * Description: DietPlanner  Class represents types of food with its nutritional vlaues.
 */
public class DietPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayBag<FoodType> dietBag = new ArrayBag<>(); //stores the diet
        //Instantiating food objects
        FoodType chicken = new FoodType("chicken", 423, 37, 0);
        FoodType spinach = new FoodType("spinach", 41, 5, 4.3);
        FoodType sweetpotato = new FoodType("sweetpotato", 180, 4, 6.6);

        //add food items to the diet bag
        dietBag.add(chicken);
        dietBag.add(spinach);
        dietBag.add(sweetpotato);

        //initializing variables to keep track of serving portions
        double totalCalories = 0;
        double totalProtein = 0;
        double totalFiber = 0;

        //prompt user to add servings until they type finish
        System.out.println("Add servings of chicken (1), spinach (2), sweet potato (3) , type 'finish' to exit: ");
        while (true) {
            //read user input
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("finish"))//exit loop
                break;
            // switch statement to handle addition of servings based on input
            switch (input) {
                case "1": // add serving of chicken
                    totalCalories += chicken.getCalories();
                    totalProtein += chicken.getProtein();
                    totalFiber += chicken.getFiber();
                    break;
                case "2": // add serving of spinach
                    totalCalories += spinach.getCalories();
                    totalProtein += spinach.getProtein();
                    totalFiber += spinach.getFiber();
                    break;
                case "3": // add serving of sweet potato
                    totalCalories += sweetpotato.getCalories();
                    totalProtein += sweetpotato.getProtein();
                    totalFiber += sweetpotato.getFiber();
                    break;
                default:
                    System.out.print("Invalid input please try again and type a number.");
            }
        }
        //Display summary of servings
        System.out.println("Total Servings added: ");
        System.out.println("Calories: " + totalCalories);
        System.out.println("Protein: " + totalProtein);
        System.out.println("Fiber: " + totalFiber);
        System.out.println("What would you like to remove? chicken (1), spinach (2), sweet potato (3) , type 'finish' to exit: ");
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("finish"))
                break;
            switch (input) {
                // switch statement to handle removal of servings based on input
                case "1": // remove serving of chicken
                    totalCalories -= chicken.getCalories();
                    totalProtein -= chicken.getProtein();
                    totalFiber -= chicken.getFiber();
                    break;
                case "2": // remove serving of spinach
                    totalCalories -= spinach.getCalories();
                    totalProtein -= spinach.getProtein();
                    totalFiber -= spinach.getFiber();
                    break;
                case "3": // remove serving of sweet potato
                    totalCalories -= sweetpotato.getCalories();
                    totalProtein -= sweetpotato.getProtein();
                    totalFiber -= sweetpotato.getFiber();
                    break;
                default:
                    System.out.print("Invalid input please try again and type a number.");
            }
        }
        //Display summary after Removal
        System.out.println("Total Servings after removal: ");
        System.out.println("Calories: " + totalCalories);
        System.out.println("Protein: " + totalProtein);
        System.out.println("Fiber: " + totalFiber);

    }
}
