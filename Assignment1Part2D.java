import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age >12) {
            System.out.println("You are a teen.");
        } else if (age >19) {
            System.out.println("You are an adult.");
        } else if (age >64) {
            System.out.println("You are a senior.");
        }

        scanner.close();
    }
}
