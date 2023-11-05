package homeworks.homework20;

import java.util.ArrayList;
import java.util.Scanner;

public class Burger {
    private final BurgerSize size;
    private final MeatType meatType;
    private ArrayList<Ingredient> ingredients = new ArrayList<>();

    public Burger(BurgerSize size, MeatType meatType, ArrayList<Ingredient> ingredients){
        this.size =size;
        this.meatType = meatType;
        this.ingredients = ingredients;
    }

    public double calculateTotalPrice() {
        double totalPrice = size.getPrice() + meatType.getPrice();
        for (Ingredient ingredient : ingredients) {
            totalPrice += ingredient.getPrice();
        }
        return totalPrice;
    }

    public void printBurgerInfo() {
        System.out.println("You created a burger");
        System.out.println("Burger Size: " + size.name().toLowerCase());
        System.out.println("Meat Type: " + meatType.name().toLowerCase());
        System.out.println("Ingredients: ");
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient.name().toLowerCase());
        }
        System.out.println("Total Price: $" + calculateTotalPrice());
    }

    public static Burger createBurgerByInput() throws ErrorCreateBurger {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please enter information into the console to create a burger.");
            System.out.println("Choose the burger size: SMALL, MEDIUM, LARGE");
            BurgerSize size;
            String inputSize = scanner.next().toUpperCase();
            if (inputSize.equals("SMALL") || inputSize.equals("MEDIUM") || inputSize.equals("LARGE")) {
                size = BurgerSize.valueOf(inputSize);
            } else {
                throw new ErrorCreateBurger("Invalid burger size entered: " + inputSize);
            }

            System.out.println("Choose the meat type: BEEF, CHICKEN, FISH");
            MeatType meatType;
            String inputMeatType = scanner.next().toUpperCase();
            if (inputMeatType.equals("BEEF") || inputMeatType.equals("CHICKEN") || inputMeatType.equals("FISH")) {
                meatType = MeatType.valueOf(inputMeatType);
            } else {
                throw new ErrorCreateBurger("Invalid meat type entered: " + inputMeatType);
            }

            ArrayList<Ingredient> selectedIngredients = new ArrayList<>();
            System.out.println("Add ingredients CHEESE, TOMATO, LETTUCE one word at a time and after enter 'Done' to finish:");
            while (scanner.hasNext()) {
                String ingredient = scanner.next().toUpperCase();
                if (ingredient.equals("DONE")) {
                    break;
                } else if (ingredient.equals("CHEESE") || ingredient.equals("TOMATO") || ingredient.equals("LETTUCE")) {
                    selectedIngredients.add(Ingredient.valueOf(ingredient));
                } else {
                    throw new ErrorCreateBurger("Invalid ingredient entered: " + ingredient);
                }
            }
            return new Burger(size, meatType, selectedIngredients);

        } catch (ErrorCreateBurger e) {
            throw e;
        }
    }

}
