import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел ряда (целое положительное):");
        int amountNumbers = scanner.nextInt();

        int seriesSum = 0;
        StringBuilder expressionString = new StringBuilder();
        StringBuilder extendedExpressionString = new StringBuilder();
        int sign = 1;

        for (int i = 1; i <= amountNumbers; i++) {
            seriesSum += numberSeriesValue(i);
            String signCurrentNumberSeriesValue = (sign == 1) ? "+" : "-";
            expressionString.append(String.format("%s(%d)²", signCurrentNumberSeriesValue, i));
            extendedExpressionString.append(String.format("%s%d", signCurrentNumberSeriesValue, i * i));
            sign = -sign;
        }

        System.out.printf("Сумма ряда для количества чисел %d равна %d:%n", amountNumbers, seriesSum);
        System.out.println(expressionString);
        System.out.println(extendedExpressionString);
    }

    private static double numberSeriesValue(int count) {
        return (count % 2 == 0) ? -Math.pow(count, 2) : Math.pow(count, 2);
    }
}