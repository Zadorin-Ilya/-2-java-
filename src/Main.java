public class Main {

    public static void main(String[] args) {


        int i = 100; // Начальный баланс лицевого счета
        int sum = 100; // Сумма от которой начисляется бонус
        int x = 1200; // Сумма пополнения клиентом

        int bonus;
        if (x > 1000) {
            bonus = x / sum;
        } else {
            bonus = 0;
        }

        int finish = x + i + bonus;


        System.out.println("Итого сумма = " + finish);
    }
}

