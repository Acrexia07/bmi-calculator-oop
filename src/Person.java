public class Person extends PersonInfo {

    // Initialization: Variable Declarations
    String name;
    int age;
    double weight;
    double height;

    // Constructor
    public Person (String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // Method: Setter (weight)
    public void setWeight (double weight) {
        this.weight = weight;
    }

    // Method: Setter (height)
    public void setHeight (double height) {
        this.height = height;
    }

    // Method: Getter (name)
    public String getName () {
        return name;
    }

    // Method: Getter (age)
    public int getAge () {
        return age;
    }

    // Method: Overriding Parent method (BMIDetails)
    @Override
    void displayPersonInfo(){
        System.out.println("\nPersonal Information:");
        System.out.printf("Name: %s\n", getName());
        System.out.printf("Age: %d\n", getAge());
    }
}
