import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void play(Scanner scanner) {
        do {
            int currentNumber = (int) (Math.random() * 100) + 1;
            boolean isFirstPlayerMove = true;
            firstPlayer.setNumber(-1);
            secondPlayer.setNumber(-1);

            while (firstPlayer.getNumber() != currentNumber &&
                    secondPlayer.getNumber() != currentNumber) {
                if (isFirstPlayerMove) {
                    System.out.println(firstPlayer + " введите число");
                    firstPlayer.setNumber(scanner.nextInt());
                    scanner.nextLine();
                    isFirstPlayerMove = false;
                } else {
                    System.out.println(secondPlayer + " введите число");
                    secondPlayer.setNumber(scanner.nextInt());
                    scanner.nextLine();
                    isFirstPlayerMove = true;
                }
            }
            if (isFirstPlayerMove) {
                System.out.println("Выиграл: " + secondPlayer);
            } else {
                System.out.println("Выиграл: " + firstPlayer);
            }
            System.out.println("Хотите продолжить игру? [yes/no]:");
        } while (scanner.nextLine().trim().toLowerCase().equals("yes"));
    }
}
