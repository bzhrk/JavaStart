public class Calculator {
    public static void main(String[] args) {
        // ============
        // Калькулятор
        // ===========
        int a = 2;
        int b = 10;
        int result = 0;
        char operator = '^';

        if (operator == '+') {
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '*') {
            result = a * b;
        } else if (operator == '/') {
            result = a / b;
        } else if (operator == '%') {
            result = a % b;
        } else if (operator == '^') {
            result = 1;
            int exponent = b; // сохраняем исходное значение степени
            while (exponent > 0) {
                result *= a;
                exponent--;
            }
        }

        System.out.println(a + " " + operator + " " + b + " = " + result);
    }
}
