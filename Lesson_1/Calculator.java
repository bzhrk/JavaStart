public class Calculator {
    public static void main(String[] args) {
        // ============
        // Калькулятор
        // ===========
        int a = 2;
        int b = 10;
        int result = 1;
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
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        }

        System.out.println(a + " " + operator + " " + b + " = " + result);
    }
}
