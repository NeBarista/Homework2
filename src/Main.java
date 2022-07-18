public class Main {
    public static void main(String[] args) {
        showSum(55, 67);
        showSubtraction(555, 222);
        showMultiplication(333, 777);
        showDivision(777, 111);
    }
    public static void showSum(int number1, int number2) {
        println(number1 + number2);
    }
    public static void showSubtraction(int number1, int number2) {
        println(number1 - number2);
    }
    public static void showMultiplication(int number1, int number2) {
        println(number1 * number2);
    }
    public static void showDivision(int number1, int number2) {
        println(number1/number2);
    }
    public static void println(int number) {
        System.out.println(number);
    }
}