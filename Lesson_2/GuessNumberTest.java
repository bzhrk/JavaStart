import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean firstPlayerMove = true;
        String answer = "yes";

        do {
            System.out.println("Начинаем игру.");
            System.out.println("Введите имя первого игрока...");
            Player firstPlayer = new Player(scanner.nextLine());

            System.out.println("Введите имя второго игрока...");
            Player secondPlayer = new Player(scanner.nextLine());

            GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);

            while (firstPlayer.getNumber() != guessNumber.getCurrentNumber() &&
                    secondPlayer.getNumber() != guessNumber.getCurrentNumber()) {
                if (firstPlayerMove) {
                    System.out.println(firstPlayer + " введите число...");
                    firstPlayer.setNumber(scanner.nextInt());
                    scanner.nextLine();
                    firstPlayerMove = false;
                } else {
                    System.out.println(secondPlayer + " введите число...");
                    secondPlayer.setNumber(scanner.nextInt());
                    firstPlayerMove = true;
                    scanner.nextLine();
                }
            }
            if (!firstPlayerMove) {
                System.out.println(firstPlayer + " won!");
            } else {
                System.out.println(secondPlayer + " won!");
            }

            System.out.println("Хотите продолжить игру? [yes/no]:");
            answer = scanner.nextLine().trim().toLowerCase();
        } while (answer.equals("yes"));
    }
}
