package UTS;

import java.util.Scanner;

public class modul3no5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"Apple", "Orange", "Banana"};
        String[] toppings = {"Chocolate", "Nuts", "Caramel"};
        double[] fruitPrices = {1.0, 1.5, 0.8};
        double[] toppingPrices = {0.5, 0.7, 0.3};
        boolean isExited = false;
        double totalCost = 0.0;

        while (!isExited) {
            System.out.println("Menu of Fruits and Toppings:");
            System.out.println("Fruits:");
            for (int i = 0; i < fruits.length; i++) {
                System.out.println((i + 1) + ". " + fruits[i] + " - $" + fruitPrices[i]);
            }
            System.out.println("Toppings:");
            for (int i = 0; i < toppings.length; i++) {
                System.out.println((i + 4) + ". " + toppings[i] + " - $" + toppingPrices[i]);
            }
            System.out.println("Enter the option number to add fruit or topping. Type 'exit' to exit.");
            String option = scanner.nextLine();

            if (option.equalsIgnoreCase("exit")) {
                isExited = true;
            } else {
                try {
                    int selectedOption = Integer.parseInt(option);
                    if (selectedOption >= 1 && selectedOption <= fruits.length) {
                        int selectedFruitIndex = selectedOption - 1;
                        System.out.println("Added " + fruits[selectedFruitIndex]);
                        totalCost += fruitPrices[selectedFruitIndex];
                    } else if (selectedOption > fruits.length && selectedOption <= (fruits.length + toppings.length)) {
                        int selectedToppingIndex = selectedOption - 1 - fruits.length;
                        System.out.println("Added " + toppings[selectedToppingIndex]);
                        totalCost += toppingPrices[selectedToppingIndex];
                    } else {
                        System.out.println("Invalid option. Please enter a valid option number.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid option number or 'exit'.");
                }
            }
        }

        System.out.println("Total cost: $" + totalCost);
        scanner.close();
    }
    
}
