public class HelloWorld {

    public static void main(String[] args) {
        printWelcome();
        String studentName = "Murugesan";
        greetStudent(studentName);
        showJavaFunFact();
    }

    // Method to print a welcome message
    public static void printWelcome() {
        System.out.println("Welcome to CIS 233J - Java Programming!");
    }

    // Method to greet the student by name
    public static void greetStudent(String name) {
        System.out.println("Hello, " + name + "! Great to see you learning Java.");
    }

    // Method to show a fun fact about Java
    public static void showJavaFunFact() {
        System.out.println("Did you know? Java was originally called Oak!");
    }
}
