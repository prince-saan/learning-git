public class HelloGit {
    public static void main(String[] args) {
        System.out.println("Hello, Git!");
        System.out.println("This is my first change.");
        greet("Learner");
        System.out.println("3 * 4 = " + multiply(3, 4));
    }

    public static void greet(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}