public class UserInputHandler {

    public static Person enterPersonalInfo () {

        // Initialization: Variable Declaration
        String name;
        int age;

        // Process: Declare class for user input - Name
        do {
            System.out.print("Enter your name: ");
            name = InputValidator.scn.nextLine();
        } while (!InputValidator.validateNameInput(name));

        // Output: Welcome Message
        System.out.printf("Welcome to the BMI Calculator, %s!\n", name);

        // Process: Declare class for user input - Age
        age = InputValidator.validateAgeInput();

        // Process: Create and return Person object with name and age
        return new Person(name, age, 0, 0);
    }
}
