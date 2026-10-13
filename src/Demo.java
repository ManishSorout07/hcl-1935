
public class Demo {
    public static void main(String[] args) {
        int age = 16;

        try {
            if (age < 18) {
                throw new ArithmeticException("Not eligible to vote");
            }

            System.out.println("Eligible to vote");

        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
