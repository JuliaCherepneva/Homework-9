//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1");
        int[] expenses = {20_345, 34_873, 27_631, 47_212, 19_654};
        int total = 0;
        for (int element : expenses) {
            total = total + element;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей.");

        System.out.println("\nЗадача 2");
        int[] spending = {30_235, 45_456, 18_063, 35_965, 11_050};
        int maxSpending = -1;
        for (final int current : spending) {
            if (current > maxSpending) {
                maxSpending = current;
            }
        }
        int minSpending = Integer.MAX_VALUE;
        for (final int current : spending) {
            if (current < Integer.MAX_VALUE) {
                minSpending = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила "+ minSpending + " рублей. " +
                "Максимальная сумма трат за неделю составила " + maxSpending + " рублей.");

        System.out.println("\nЗадача 3");
        int [] expenditure = {12_678, 34_847, 37_312, 10_234, 43_235};
        int sum = 0;
        double mean = 0;
        for (int element : expenditure) {
            sum =  sum + element;
        }
        mean = sum / expenditure.length;
        System.out.println("Средняя сумма трат за месяц составила " + mean + " рублей.");

        System.out.println("\nЗадача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
        }


    }
}