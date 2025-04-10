public class MyFirstGame {
    public static void main(String[] args) {
        // ============
        // УГАДАЙ ЧИСЛО
        // ============
        int originalNumber = 47;
        int min = 1;
        int max = 100;
        int result = 1;

        while (true) {
            result = (min + max) / 2;

            if (result > originalNumber) {
                System.out.println(result + " больше того что загадал компьютер");
                max = result - 1;
            } else if (result < originalNumber) {
                System.out.println(result + " меньше того что загадал компьютер");
                min = result + 1;
            } else {
                System.out.println("Вы победили!");
                break;
            }
        }

    }
}
