public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int currentNumber;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        currentNumber = (int) (Math.random() * 100) + 1;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public Player getPlayer1() {
        return firstPlayer;
    }

    public Player getPlayer2() {
        return secondPlayer;
    }
}
