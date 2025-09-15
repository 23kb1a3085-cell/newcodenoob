
public class FunctionTypes {

    // 1. Method Declaration (like Function Declaration)
    public static String greetDeclaration(String name) {
        return "Hello, " + name + "! This is a method declaration.";
    }

    public static void main(String[] args) {
        // 2. Function Expression equivalent using anonymous class
        Greeting greetExpression = new Greeting() {
            @Override
            public String greet(String name) {
                return "Hello, " + name + "! This is an anonymous class.";
            }
        };

        // 3. Arrow Function equivalent using Lambda (Java 8+)
        Greeting greetArrow = (name) -> "Hello, " + name + "! This is a lambda expression.";

        // Calling all the functions/methods
        System.out.println(greetDeclaration("Alice"));
        System.out.println(greetExpression.greet("Bob"));
        System.out.println(greetArrow.greet("Charlie"));
    }
}

// Functional Interface to use Lambda and Anonymous classes
interface Greeting {
    String greet(String name);
}
