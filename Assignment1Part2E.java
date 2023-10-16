import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rock, Paper, or Scissors");
        System.out.print("Player 1, Choose 1 for rock, 2 for paper, 3 for scissors): ");
        int player1 = scanner.nextInt();

        System.out.print("Player 2, Choose 1 for rock, 2 for paper, 3 for scissos ");
        int player2 = scanner.nextInt();

        if (player1 == player2) {
            System.out.println("Draw");
        } else if ((player1 == 1 & player2 == 3) | (player1 == 2 & player2 == 1) | (player1 == 3 & player2 == 2)) {
            System.out.println("Player 1 wins");
        } else {
            System.out.println("Player 2 won");
        }

        scanner.close();
    }
}
