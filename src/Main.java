public class Main {
    public static void main(String[] args) {
        int start = 100;
        int topUp = 600;
        int bonus;


        if (topUp > 1000) {
            bonus = topUp / 100;
            int bonusAmount = start + topUp + bonus;
            System.out.println("Итоговая сумма на счету: " + bonusAmount);
        } else {
            int sum = start + topUp;
            System.out.println("Итоговая сумма на счету: " + sum);
        }


    }
}