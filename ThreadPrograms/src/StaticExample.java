public class StaticExample {

    // Static variable
    static int staticVariable = 10;

    // Instance variable
    int instanceVariable = 20;

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Instance method
    void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        // Accessing static variable
        System.out.println("Static Variable: " + staticVariable);

        // Accessing static method
        staticMethod();

        // Creating an instance of StaticExample
        StaticExample obj = new StaticExample();

        // Accessing instance variable
        System.out.println("Instance Variable: " + obj.instanceVariable);

        // Accessing instance method
        obj.instanceMethod();

        // Changing the value of the static variable
        staticVariable = 30;
//        System.out.println("Static Variable after change: " + staticVariable);

        // Accessing the static variable again to show it has been changed
        System.out.println("Static Variable after change: " + StaticExample.staticVariable);
    }
}
