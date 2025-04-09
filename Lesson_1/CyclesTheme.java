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

        for (int i = maxNumber - 1; i > minNumber; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // ============================================
        // 3. ВЫВОД РЕВЕРСИВНОГО ЧИСЛА И СУММЫ ЕГО ЦИФР
        // ============================================
        System.out.println("3. ВЫВОД РЕВЕРСИВНОГО ЧИСЛА И СУММЫ ЕГО ЦИФР");
        int originalNumber = 1234;
        int digitSum = 0;
        while (originalNumber > 0) {
            int digit = originalNumber % 10;
            digitSum += digit;
            originalNumber /= 10;
            System.out.print(digit);
        }
        System.out.println("\nСумма выделенных цифр: " + digitSum + "\n");

        // ================================
        // 4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК
        // ================================
        System.out.println("4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");
        rangeStart = 1;
        rangeEnd = 24;
        int countInRow = 0;

        for (int i = rangeStart; i < rangeEnd; i += 2) {
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

        int number = 3242592;
        originalNumber = number;
        int twosCount = 0;
        int digit = 0;

        while (originalNumber > 0) {
            digit = originalNumber % 10;
            if (digit == 2) {
                twosCount++;
            }
            originalNumber /= 10;
        }

        String parity = (twosCount % 2 == 0) ? "четное" : "нечетное";
        System.out.println("В числе " +
                number + " количество двоек — " + twosCount + ", это " + parity + " число.\n");

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
            System.out.println();
        }
        System.out.println();

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
        System.out.println("8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ");
        currentNumber = 1234321;
        int original = currentNumber;
        int reversed = 0;
        while (original > 0) {
            digit = original % 10;
            reversed = reversed * 10 + digit;
            original /= 10;
        }
        if (currentNumber == reversed) {
            System.out.println("Число " + currentNumber + " - палиндром\n");
        } else {
            System.out.println("Число " + currentNumber + " - не палиндром\n");
        }

        // =========================================================
        // 9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ
        // =================================================
        System.out.println("9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ");

        number = 123321;
        original = number;

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < 6; i++) {
            digit = original % 10;

            if (i < 3) {
                rightSum += digit; // последние 3 цифры
            } else {
                leftSum += digit; // первые 3 цифры
            }

            original /= 10;
        }

        if (leftSum == rightSum) {
            System.out.println("Число " + number + " — счастливое");
        } else {
            System.out.println("Число " + number + " — не счастливое");
        }

        System.out.println("Сумма левой части: " + leftSum);
        System.out.println("Сумма правой части: " + rightSum);

        // ====================================
        // 10. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ ПИФАГОРА
        // ====================================
        System.out.println("\n10. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ ПИФАГОРА");

        System.out.print("   |");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n---+-------------------------------");

        for (int i = 2; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
