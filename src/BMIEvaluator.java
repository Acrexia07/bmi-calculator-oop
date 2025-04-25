public class BMIEvaluator {

    // Method: User input - Weight
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

    // Method: User input - Height
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

    // Method: Calculate BMI
    public static double calculateBMI (double weight, double height) {
        return weight / Math.pow(height, 2);
    }

    // Method: Evaluate BMI results
    public static void evaluateBMI (double weight, double height, Person person) {

        // Process: Setter values for person
        person.setWeight(weight);
        person.setHeight(height);

        // Process: Calculate BMI
        double resultBMI = calculateBMI(weight, height);

        // Process: Evaluate BMI Result
        if (Double.isNaN(resultBMI) || resultBMI <= 0) {
            System.out.println("Invalid BMI result. Please check your inputs.");
        }
        else if (resultBMI > 100) {
            System.out.println("BMI is unusually high. Please check the values again.");
        }
        else {
            person.displayPersonInfo();
            System.out.printf("BMI Results: %.2f.\n", resultBMI);
            if (resultBMI < 18.5) {
                System.out.println("Description: You are underweight.");
            } else if (resultBMI >= 18.5 && resultBMI <= 24.9) {
                System.out.println("Description: You have a normal weight.");
            } else if (resultBMI >= 25 && resultBMI < 29.9) {
                System.out.println("Description: You are overweight.");
            } else {
                System.out.println("Description: You are obese.");
            }
        }
    }
}
