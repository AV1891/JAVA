import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String Name1 = "Asees";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String Name2 = scanner.nextLine();

        if (Name2.equals(Name1)) {
            System.out.println("Hello, " + Name2 + "! You have the same name as programmer.");
        } else {
            System.out.println("Hello, " + Name2 + "! Your name is different from programmer.");
        }

        scanner.close();
    }
}


