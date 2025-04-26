import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {

    // Initialization: Object Declaration
    public static final Scanner scn = new Scanner(System.in);

    // Method: Validate user input - Double Data type
    public static double validateDoubleInput (String prompt) {

        // Initialization: Variable Declaration
        double input;

        // Process: Loop until the condition became false.
        while (true) {
            System.out.print(prompt);
            try {
                input = scn.nextDouble();
                if (input <= 0) {
                    System.out.println("Invalid input: Number must be positive.");
                } else {
                    return input;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input: Enter numbers only! Please try again.");
                scn.next();
            }
        }
    }

    // Method: Validate user input - Name
    public static boolean validateNameInput (String name) {
        // Initialization: Variable Declaration
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name cannot be empty. Please try again.");
            return false;
        }
        else if (!name.matches("^[a-zA-Z\\s-]+$")) {
            System.out.println("Invalid name. Please enter a valid name containing only letters, spaces, and hyphens.");
            return false;
        }
        return true;
    }

    // Method: Validate user input - Age
    public static int validateAgeInput () {

        // Initialization: Variable Declaration
        int age;

        // Process: Repeats until a valid integer between 1 and 100 is entered.
        while (true) {
            System.out.print("Enter your age: ");

            if(!scn.hasNextInt()){
                System.out.println("Input Mismatch: Enter whole numbers only! Please try again.");
                scn.next();
            }
            else {
                age = scn.nextInt();
                scn.nextLine();
                // Process: Validate the age limitations
                if (age <= 0) {
                    System.out.println("Age doesn't contain negative numbers! Please try again.");
                }
                else if ( age > 100){
                    System.out.println("Invalid Age! Please try again.");
                } else {
                    return age;
                }
            }
        }
    }

    // ---------- BMI related inputs ----------

    // Method: Validate user input - Weight
    public static boolean evaluateWeightInput (double weight) {
        // Process: Evaluate Weight input
        if(weight <= 0){
            System.out.println("Invalid weight input! Please try again.");
            return false;
        }
        else if (weight <= 10 || weight >= 300) {
            System.out.println("Weight out of range! Please try again.");
            return false;
        } else {
            return true;
        }
    }

    // Method: Validate user input - Height
    public static boolean evaluateHeightInput (double height) {
        // Process: Evaluate Height input
        if (height <= 0 ) {
            System.out.println("Invalid input: Height must be positive. Please try again.");
            return false;
        }
        else if (height < 0.5 || height > 2.5) {
            System.out.println("Invalid input: Height out of range. Please enter a realistic height (0.5m to 2.5m).");
            return false;
        }
        return true;
    }



    // Method: Validate user Input - BMI inputs
    public static void enterBMIInputs (Person person) {

        // Initialization: Variable Declarations
        double weight;
        double height;

        // Process: Repeat input prompt until a valid weight is entered
        do {
            // Process: Validate inputs (Double data type)
            weight = validateDoubleInput("Enter your weight (kg): ");
        } while (!evaluateWeightInput(weight));

        // Process: Repeat input prompt until a valid height is entered
        do {
            // Process: Validate inputs (Double data type)
            height = validateDoubleInput("Enter your height (m): ");
        } while (!evaluateHeightInput(height));

        // Process: Evaluate BMI results
        BMIEvaluator.evaluateBMI(weight, height, person);
    }

    // Method: Closing Scanner object
    public static void closeScanner(){
        scn.close();
    }
}
