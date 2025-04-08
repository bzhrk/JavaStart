public class CyclesTheme {
    public static void main(String[] args) {
        // ========================================
        // 1. ПОДСЧЕТ СУММЫ ЧЕТНЫХ И НЕЧЕТНЫХ ЧИСЕЛ
        // ========================================
        System.out.println("1. ПОДСЧЕТ СУММЫ ЧЕТНЫХ И НЕЧЕТНЫХ ЧИСЕЛ");

        int rangeStart = -10;
        int rangeEnd = 21;
        int currentNumber = rangeStart;
        int evenNumbersSum = 0;
        int oddNumbersSum = 0;

        do {
            if (currentNumber % 2 == 0) {
                evenNumbersSum += currentNumber;
            } else {
                oddNumbersSum += currentNumber;
            }
            currentNumber++;
        } while (currentNumber <= rangeEnd);

        System.out.println("В отрезке [" + rangeStart + ", " + rangeEnd +
                "] сумма четных чисел = " + evenNumbersSum +
                ", а нечетных = " + oddNumbersSum + "\n");

        // =================================================
        // 2. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX В ПОРЯДКЕ УБЫВАНИЯ
        // =================================================
        System.out.println("2. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX В ПОРЯДКЕ УБЫВАНИЯ");

        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = -1;
        int minNumber = firstNumber;
        int maxNumber = firstNumber;

        if (minNumber > secondNumber) {
            minNumber = secondNumber;
        }
        if (minNumber > thirdNumber) {
            minNumber = thirdNumber;
        }
        if (maxNumber < secondNumber) {
            maxNumber = secondNumber;
        }
        if (maxNumber < thirdNumber) {
            maxNumber = thirdNumber;
        }

        for (int i = maxNumber; i > minNumber; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // ============================================
        // 3. ВЫВОД РЕВЕРСИВНОГО ЧИСЛА И СУММЫ ЕГО ЦИФР
        // ============================================
        System.out.println("3. ВЫВОД РЕВЕРСИВНОГО ЧИСЛА И СУММЫ ЕГО ЦИФР");
        int number = 1234;
        int digitSum = 0;
        while (number != 0) {
            int digit = number % 10;
            digitSum += digit;
            number /= 10;
            System.out.print(digit + " ");
        }
        System.out.println("\nСумма выделенных цифр: " + digitSum + "\n");

        // ================================
        // 4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК
        // ================================
        System.out.println("4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");
        minNumber = 1;
        maxNumber = 24;
        int countInRow = 0;

        for (int i = minNumber; i < maxNumber; i += 2) {
            System.out.printf("%2d ", i);
            countInRow++;
            if (countInRow == 5) {
                System.out.println();
                countInRow = 0;
            }
        }
        while (countInRow < 5 && countInRow != 0) {
            System.out.printf("%2d ", 0);
            countInRow++;
        }
        System.out.println("\n");

        // =========================================================
        // 5. ПРОВЕРКА КОЛИЧЕСТВА ДВОЕК ЧИСЛА НА ЧЕТНОСТЬ/НЕЧЕТНОСТЬ
        // =========================================================
        System.out.println("5. ПРОВЕРКА КОЛИЧЕСТВА ДВОЕК ЧИСЛА НА ЧЕТНОСТЬ/НЕЧЕТНОСТЬ");
        number = 3242592;
        int twosCount = 0;
        int digit = 0;

        while (number != 0) {
            digit = number % 10;
            if (digit == 2) {
                twosCount++;
            }
            number /= 10;
        }
        String parity = digit % 2 == 0 ? " четное " : " нечетное ";

        System.out.println("В " + number + parity + "(" + digit + ") количество двоек" + "\n");

        // =============================
        // 6. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР
        // =============================
        System.out.println("6. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        while (countInRow > 0) {
            int count = countInRow;
            while (count > 0) {
                System.out.print("#");
                count--;
            }
            countInRow--;
            System.out.println("");
        }
        System.out.println("");

        int maxWidth = 3;
        int currentWidth = 1;
        int direction = 1;

        do {
            int printedCount = 0;
            while (printedCount < currentWidth) {
                System.out.print("$");
                printedCount++;
            }
            System.out.println();

            if (currentWidth == maxWidth) {
                direction = -1;
            }

            currentWidth += direction;
        } while (currentWidth > 0);

        // =======================
        // 7. ВЫВОД ASCII-СИМВОЛОВ
        // =======================
        System.out.println("\n7. ВЫВОД ASCII-СИМВОЛОВ");

        System.out.println("DECIMAL CHARACTER DESCRIPTION");

        for (int i = 33; i < 122; i++) {
            if (i % 2 != 0 && i <= 47) {
                System.out.println("   " + i + "       " + (char) i + "          " + Character.getName(i));
            }
            if (i % 2 == 0 && i > 97) {
                System.out.println("   " + i + "       " + (char) i + "          " + Character.getName(i));
            }
        }
        System.out.println("\n");

        // ==========================================
        // 8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ
        // ==========================================
        System.out.println("\n8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ");
        number = 1234321;
        int original = number;
        int reversed = 0;
        while (original != 0) {
            digit = original % 10;
            reversed = reversed * 10 + digit;
            original /= 10;
        }
        if (number == reversed) {
            System.out.println("Число " + number + " - палиндром\n");
        } else {
            System.out.println("Число " + number + " - не палиндром\n");
        }

        // =========================================================
        // 9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ
        // =================================================
        System.out.println("9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ");

        number = 123321;
        original = number;
        digit = 0;
        int firstSum = 0;
        int secondSum = 0;

        for (int i = 0; i < 3; i++) {
            digit = original % 10;
            firstSum += digit;
            original /= 10;
        }

        for (int i = 0; i < 3; i++) {
            digit = original % 10;
            secondSum += digit;
            original /= 10;
        }

        if (firstSum == secondSum) {
            System.out.println("Число " + number + " - счастливое");
        } else {
            System.out.println("Число " + number + " - не счастливое");
        }

        System.out.println("Сумма цифр " + number / 1000 + " = " + firstSum);
        System.out.println("Сумма " + number % 1000 + " = " + secondSum);

        // ====================================
        // 10. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ ПИФАГОРА
        // ====================================
        System.out.println("\n10. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ ПИФАГОРА");

        System.out.print("   |");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.println("---+-------------------------------");

        for (int i = 2; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

    }
}
