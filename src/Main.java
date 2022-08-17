public class Main {
    public static void main(String[] args) {
        exercise1_3();
        exercise4();
    }
        public static void exercise1_3 () {
        int[] monthExpenses = {100231, 198232, 200000, 156789, 125876, 198456, 154303, 164732, 126734, 198001, 100001, 167834, 138987, 138444, 134610, 178383, 198323, 132383, 187483, 178654, 187789, 198082, 196006, 125989, 194311, 134970, 122222, 130135, 144989, 199123};

        //Задача1
        int sumMonth = 0;
            for (int expens : monthExpenses) {
                sumMonth = sumMonth + expens;
            }
        System.out.println("Сумма трат за месяц составила " + sumMonth + " рублей");

        //Задача2
        int maxExpensesMonth = -1;
        int minExpensesMonth = 200001;

            for (int monthExpens : monthExpenses) {
                if (monthExpens > maxExpensesMonth) {
                    maxExpensesMonth = monthExpens;
                }
                if (monthExpens < minExpensesMonth) {
                    minExpensesMonth = monthExpens;
                }
            }
        System.out.println("Максимальная сумма трат за день составила " + maxExpensesMonth + " рублей. Минимальная сумма трат за день составила " + minExpensesMonth + " рублей");

        //Задача3
        double arrayExpensesMonth = 0;
        arrayExpensesMonth = (double) sumMonth / monthExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + arrayExpensesMonth + " рублей");
    }
    public static void exercise4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}