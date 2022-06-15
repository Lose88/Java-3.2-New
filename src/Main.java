public class Main {
    public static void main(String[] args) {
        int bill = 2000; // Сумма на счете
        int replenishment = 10000; // Сумма пополнения
        int bonus;
        int finalBill;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
            finalBill = bill + replenishment + bonus;
            System.out.println("Количество бонусов: " + bonus);
            System.out.println("Сумма счета включая бонусы: " + finalBill);
        } else {
            finalBill = bill + replenishment;
            System.out.println("Количество бонусов 0");
            System.out.println("Сумма счета: " + finalBill);

        }


    }
}
