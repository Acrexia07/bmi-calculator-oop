public class Main {
    public static void main(String[] args) {

        // Initialize: Create a Person object by collecting user's personal information (name and age)
        Person person = UserInputHandler.enterPersonalInfo();

        // Input/Output: BMI inputs
        InputValidator.enterBMIInputs(person);

        // Exit: Closing Scanner Object
        InputValidator.closeScanner();
    }
}
