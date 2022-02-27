import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);
    }

    private void calculate(int firstOperand, int secondOperand) {
        try {
            int addition = firstOperand + secondOperand;
            int subtraction = firstOperand - secondOperand;
            int mutiplication = firstOperand * secondOperand;
            int division = firstOperand / secondOperand;
            System.out.println("Tổng x + y = " + addition);
            System.out.println("Hiệu x - y = " + subtraction);
            System.out.println("Tích x * y = " + mutiplication);
            System.out.println("Thương x / y = " + division);
        }
        catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
