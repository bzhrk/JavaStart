public class CyclesTheme {
    public static void main(String[] args) {
        // ========================================
        // 1. ПОДСЧЕТ СУММЫ ЧЕТНЫХ И НЕЧЕТНЫХ ЧИСЕЛ
        // ========================================
        System.out.println("1. ПОДСЧЕТ СУММЫ ЧЕТНЫХ И НЕЧЕТНЫХ ЧИСЕЛ");

        int currentNumber = -10;
        int evenNumbersSum = 0;
        int oddNumbersSum = 0;

        do {
            if (currentNumber % 2 == 0) {
                evenNumbersSum += currentNumber;
            } else {
                oddNumbersSum += currentNumber;
            }
            currentNumber++;
        } while (currentNumber < 21);

        System.out.println("В отрезке [-10, 21] сумма четных чисел = " +
                evenNumbersSum + ", а нечетных = " + oddNumbersSum + "\n");

        // =================================================
        // 2. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX В ПОРЯДКЕ УБЫВАНИЯ
        // =================================================
        System.out.println("2. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX В ПОРЯДКЕ УБЫВАНИЯ");

        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = -1;

        int minNumber = firstNumber;
        int maxNumber = firstNumber;

        if (secondNumber < minNumber) {
            minNumber = secondNumber;
        }
        if (thirdNumber < minNumber) {
            minNumber = thirdNumber;
        }
        if (secondNumber > maxNumber) {
            maxNumber = secondNumber;
        }
        if (thirdNumber > maxNumber) {
            maxNumber = thirdNumber;
        }

        for (int current = maxNumber; current >= minNumber; current--) {
            System.out.print(current + " ");
        }

        System.out.println("\n");

        // =================================================
        // 3. ВЫВОД РЕВЕРСИВНОГО ЧИСЛА И СУММЫ ЕГО ЦИФР
        // =================================================
        System.out.println("3. ВЫВОД РЕВЕРСИВНОГО ЧИСЛА И СУММЫ ЕГО ЦИФР");

        int number = 1234;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            System.out.println(digit);
            number /= 10;
        }
        System.out.println();

        // =================================================
        // 4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК
        // =================================================
        System.out.println("4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");

        int countInRow = 0;

        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%2d ", i);
            countInRow++;
            if (countInRow == 5) {
                System.out.println();
                countInRow = 0;
            }
        }

        while (countInRow < 5 && countInRow != 0) {
            System.out.printf("%-2d ", 0);
            countInRow++;
        }
        System.out.println("\n");

        // =========================================================
        // 5. ПРОВЕРКА КОЛИЧЕСТВА ДВОЕК ЧИСЛА НА ЧЕТНОСТЬ/НЕЧЕТНОСТЬ
        // =========================================================
        System.out.println("5. ПРОВЕРКА КОЛИЧЕСТВА ДВОЕК ЧИСЛА НА ЧЕТНОСТЬ/НЕЧЕТНОСТЬ");

        int originalValueFrom5Task = 3_242_592;
        int variableFrom5task = originalValueFrom5Task;
        int resultFrom5Task = 0;

        while (variableFrom5task != 0) {
            int digitFrom5Task = variableFrom5task % 10;
            if (digitFrom5Task == 2) {
                resultFrom5Task++;
            }
            variableFrom5task /= 10;
        }

        String parityFrom5Task = resultFrom5Task % 2 == 0 ? "четное" : "нечетное";

        System.out.println("В " + originalValueFrom5Task + " " +
                parityFrom5Task + " (" + resultFrom5Task + ") количество двоек" + "\n");

        // =========================================================
        // 6. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР
        // =================================================
        System.out.println("6. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int i = 5;

        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print("#");
                j--;
            }
            System.out.println();
            i--;
        }
        System.out.println();

        int height = 3;
        int row = 1;
        int step = 1;

        do {
            int countFrom6Task = 1;
            do {
                System.out.print("$");
                countFrom6Task++;
            } while (countFrom6Task <= row);
            System.out.println();
            if (row == height) {
                step = -1;
            }
            row += step;
        } while (row > 0);
        System.out.println();

        // =========================================================
        // 7. ВЫВОД ASCII-СИМВОЛОВ
        // =================================================
        System.out.println("7. ВЫВОД ASCII-СИМВОЛОВ");

        System.out.println("DECIMAL CHARACTER DESCRIPTION");

        for (int j = 33; j < 122; j++) {
            if (j % 2 != 0 && j <= 47) {
                System.out.println("   " + j + "       " + (char) j + "          " + Character.getName(j));
            }
            if (j % 2 == 0 && j > 97) {
                System.out.println("   " + j + "       " + (char) j + "          " + Character.getName(j));
            }
        }
        System.out.println("\n");

        // =========================================================
        // 8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ
        // =================================================
        System.out.println("8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ");

        int numberFrom8 = 1234321;
        int originalValueFrom8 = numberFrom8;
        int reversedFrom8 = 0;

        while (numberFrom8 != 0) {
            int digitFrom8 = numberFrom8 % 10;
            reversedFrom8 = reversedFrom8 * 10 + digitFrom8;
            numberFrom8 /= 10;
        }

        if (originalValueFrom8 == reversedFrom8) {
            System.out.println("Число " + originalValueFrom8 + " - палиндром\n");
        } else {
            System.out.println("Число " + originalValueFrom8 + " - не палиндром\n");
        }

        // =========================================================
        // 9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ
        // =================================================
        System.out.println("9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ");

        int numberFrom9 = 123321;
        int originalValueFrom9 = numberFrom9;
        int firstSum = 0;
        int secondSum = 0;

        for (int k = 0; k < 3; k++) {
            int digit = numberFrom9 % 10;
            secondSum += digit;
            numberFrom9 /= 10;
        }

        for (int l = 0; l < 3; l++) {
            int digit = numberFrom9 % 10;
            firstSum += digit;
            numberFrom9 /= 10;
        }

        if (firstSum == secondSum) {
            System.out.println("Число " + originalValueFrom9 + " - счастливое");
        } else {
            System.out.println("Число " + originalValueFrom9 + " - не счастливое");
        }

        System.out.println("Сумма цифр " + originalValueFrom9 / 1000 + " = " + firstSum + "\n");
        System.out.println("Сумма " + originalValueFrom9 % 1000 + " = " + secondSum + "\n");

        // ====================================
        // 10. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ ПИФАГОРА
        // ====================================
        System.out.println("10. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ ПИФАГОРА");

        System.out.print("   |");
        for (int u = 2; u <= 9; u++) {
            System.out.printf("%4d", u);
        }
        System.out.println();

        System.out.println("---+-------------------------------");

        for (int o = 2; o <= 9; o++) {
            System.out.printf("%2d |", o);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%4d", o * j);
            }
            System.out.println();
        }
    }
}
