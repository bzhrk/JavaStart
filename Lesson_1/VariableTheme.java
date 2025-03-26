public class VariableTheme {
    public static void main(String[] args) {
        // =================================
        // 1. ВЫВОД ХАРАКТЕРИСТИК КОМПЬЮТЕРА
        // =================================
        System.out.println("1. ВЫВОД ХАРАКТЕРИСТИК КОМПЬЮТЕРА");

        // Количество USB портов
        byte usbPortCount = 4;
        System.out.println("Количество USB портов: " + usbPortCount);

        // Количество ядер процессора
        short cpuCoreCount = 16;
        System.out.println("Количестов ядер: " + cpuCoreCount);

        // Обьем оперативной памяти в килобайтах
        int ramCapacity = 100_663_296;
        System.out.println("Объем оперативной памяти в кб: " + ramCapacity);

        // Обьем жесткого диска
        long hddCapacity = 2_147_483_648L;
        System.out.println("Объем жесткого диска в кб: " + hddCapacity);

        // Частота процессора?
        float cpuFrequency = 3.6f;
        System.out.println("Частота процессора: " + cpuFrequency);

        // Частота обновления монитора
        double screenRefreshRate = 60.0;
        System.out.println("Частота обновления экрана: " + screenRefreshRate);

        // Есть ssd?
        boolean hasSsd = true;
        System.out.println("Есть SSD? " + hasSsd);

        // Класс энергопотребления
        char energyClass = 'A';
        System.out.println("Класс энергопотребления:" + energyClass);
        System.out.println();

        // =====================================
        // 2. РАСЧЕТ СТОИМОСТИ ТОВАРА СО СКИДКОЙ
        // =====================================================
        System.out.println("2. РАСЧЕТ СТОИМОСТИ ТОВАРА СО СКИДКОЙ");

        // Стоимость товаров
        double penPrice = 105.5;
        double bookPrice = 235.83;

        // Скидка в процентах
        double discountPercent = 11;

        // Общая стоимость товара
        double totalPrice = penPrice + bookPrice;
        totalPrice = Math.round(totalPrice * 100.0) / 100;

        // Сумма скидки
        double discountSum = totalPrice * (discountPercent / 100);
        discountSum = Math.round(discountSum * 100.0) / 100;

        // Общая стоимость товара со скидкой
        double finalPrice = totalPrice - discountSum;
        finalPrice = Math.round(finalPrice * 100.0) / 100;

        System.out.println("Стоимость ручки: " + penPrice);
        System.out.println("Стоимость книги: " + bookPrice);
        System.out.println("Скидка в процентах: " + discountPercent);
        System.out.println("Сумма скидки: " + discountSum);
        System.out.println("Общая стоимость товара: " + totalPrice);
        System.out.println("Общая стоимость товара со скидкой: " + finalPrice);
        System.out.println();

        // ==================================
        // 3. ВЫВОД СЛОВА JAVA БЕЗ ПЕРЕМЕННЫХ
        // ==================================
        System.out.println("3. ВЫВОД СЛОВА JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println();

        // ================================================
        // 4. ВЫВОД MIN И MAX ЗНАЧЕНИЙ ЦЕЛЫХ ЧИСЛОВЫХ ТИПОВ
        // ================================================
        System.out.println("ВЫВОД MIN И MAX ЗНАЧЕНИЙ ЦЕЛЫХ ЧИСЛОВЫХ ТИПОВ");

        // Инициализируем maxByte максимальным значением
        byte maxByte = 127;

        // Вывод первоначального значения maxByte
        System.out.println("Первоначальное значение maxByte :" + maxByte);

        // Вывод maxByte ++
        System.out.println("Инкрементируем на 1. maxByte :" + ++maxByte);

        // Вывод maxByte --
        System.out.println("Декрементируем на 1. maxByte :" + --maxByte);
        System.out.println();

        // Инициализируем maxShort максимальным значением
        short maxShort = 32_767;

        // Вывод первоначального значения maxShort
        System.out.println("Первоначальное значение maxShort :" + maxShort);

        // Вывод maxShort ++
        System.out.println("Инкрементируем на 1. maxShort :" + ++maxShort);

        // Вывод maxShort --
        System.out.println("Декрементируем на 1. maxShort :" + --maxShort);
        System.out.println();

        // Инициализируем maxInt максимальным значением
        int maxInt = 2_147_483_647;

        // Вывод первоначального значения maxInt
        System.out.println("Первоначальное значение maxInt :" + maxInt);

        // Вывод maxInt ++
        System.out.println("Инкрементируем на 1. maxInt :" + ++maxInt);

        // Вывод maxInt --
        System.out.println("Декрементируем на 1. maxInt :" + --maxInt);
        System.out.println();

        // Инициализируем maxLong максимальным значением
        long maxLong = 9_223_372_036_854_775_807L;

        // Вывод первоначального значения maxLong
        System.out.println("Первоначальное значение maxLong :" + maxLong);

        // Вывод maxLong ++
        System.out.println("Инкрементируем на 1. maxLong :" + ++maxLong);

        // Вывод maxLong --
        System.out.println("Декрементируем на 1. maxLong :" + --maxLong);
        System.out.println();

        // Инициализируем maxCharNum максимальным значением
        char maxCharNum = 65_535;

        // Вывод первоначального значения maxCharNum
        System.out.println("Первоначальное значение maxChar :" + (int) maxCharNum);

        // Вывод maxCharNum ++
        System.out.println("Инкрементируем на 1. Переполнение и обнуление maxCharNum :" + (int) ++maxCharNum);

        // Вывод maxCharNum --
        System.out.println("Декрементируем на 1. maxCharNum :" + (int) --maxCharNum);
        System.out.println();

        // ===================================
        // 5. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ПЕРЕМЕННЫХ
        // ===================================
        System.out.println("5. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ПЕРЕМЕННЫХ");

        // Вариант 1. Меняем местами переменные с помощью третьей переменной
        System.out.println("Вариант 1. Меняем местами значения переменныx с помощью третьей переменной");
        int a = 2;
        int b = 5;
        System.out.println("Исходное значение перменной a :" + a);
        System.out.println("Исходное значение перменной b :" + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Новое значение переменной a: " + a);
        System.out.println("Новое значение переменной b: " + b);
        System.out.println();

        // Вариант 2. Меняем местами переменные с помощью арифметических операций
        System.out.println("Варинт 2. Меняем местами переменные с помощью арифметических операций");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Новое значение переменной a: " + a);
        System.out.println("Новое значение переменной b: " + b);
        System.out.println();

        // Вариант 3. Меняем местами переменные с помощью побитовой операции
        System.out.println("Вариант 3. Меняем местами переменные с помощью побитовой операции");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Новое значение переменной a: " + a);
        System.out.println("Новое значение переменной b: " + b);
        System.out.println();

        // ============================
        // 6. ВЫВОД СИМВОЛОВ И ИХ КОДОВ
        // ============================
        System.out.println("6. ВЫВОД СИМВОЛОВ И ИХ КОДОВ");
        char dollarSign = '$';
        System.out.println("Код символа: " + (int) dollarSign + " Символ: $");
        char asterisk = '*';
        System.out.println("Код символа: " + (int) asterisk + " Символ: *");
        char atSign = '@';
        System.out.println("Код символа: " + (int) atSign + " Символ: @");
        char caret = '^';
        System.out.println("Код символа: " + (int) caret + " Символ: ^");
        char tilde = '~';
        System.out.println("Код символа: " + (int) tilde + " Символ: ~");
        System.out.println();

        // =================================
        // 7. ВЫВОД В КОНСОЛЬ ASCII-АРТ ДЮКА
        // =================================
        System.out.println("7. ВЫВОД В КОНСОЛЬ ASCII-АРТ ДЮКА");

        // Уникальные символы
        char s = '/';
        char bs = '\\';
        char u = '_';
        char l = '(';
        char r = ')';

        // Вывод ASCII-арта Дюка
        System.out.println("    " + s + bs);
        System.out.println("   " + s + "  " + bs);
        System.out.println("  " + s + u + l + " " + r + bs);
        System.out.println(" " + s + "      " + bs);
        System.out.println(s + "" + u + u + u + u + s + bs + u + u + bs);
        System.out.println();

        // =====================================================
        // 8. МАНИПУЛЯЦИИ С СОТНЯМИ, ДЕСЯТКАМИ И ЕДИНИЦАМИ ЧИСЛА
        // =====================================================
        System.out.println("8. МАНИПУЛЯЦИИ С СОТНЯМИ, ДЕСЯТКАМИ И ЕДИНИЦАМИ ЧИСЛА");
        int num = 123;
        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int units = num % 10;

        System.out.println("Число 123 содержит: ");
        System.out.println("Сотен -" + hundreds);
        System.out.println("Десятков -" + tens);
        System.out.println("Единиц -" + units);
        System.out.println("Сумма разрядов = " + (hundreds + tens + units));
        System.out.println("Произведение разрядов = " + (hundreds * tens * units));
        System.out.println();

        // =====================================================
        // 9. ПЕРЕВОД СЕКУНД В ЧАСЫ, МИНУТЫ И СЕКУНДЫ
        // =====================================================
        System.out.println("ПЕРЕВОД СЕКУНД В ЧАСЫ, МИНУТЫ И СЕКУНДЫ");
        int seconds = 86399;
        int resultHours = seconds / 3600;
        int resultMinutes = (seconds % 3600) / 60;
        int resultSeconds = seconds % 60;
        System.out.println(resultHours + ":" + resultMinutes + ":" + resultSeconds);
        System.out.println();
    }
}
