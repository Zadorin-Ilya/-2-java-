public class Main {

    public static void main(String[] args) {


        int balans = 100; // Начальный баланс лицевого счета
        int sum = 100; // Сумма от которой начисляется бонус
        int deposit = 1200; // Сумма пополнения клиентом

        int bonus;
        if (deposit > 1000) {
            bonus = deposit / sum;
        } else {
            bonus = 0;
        }

        int finish = deposit + balans + bonus;


        System.out.println("Итого сумма = " + finish);
    }
}

