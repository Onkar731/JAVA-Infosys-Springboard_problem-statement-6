public class Swap {
    public static String swap(int num1, int num2) {
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;

        return num1 + "," + num2;
    }
}