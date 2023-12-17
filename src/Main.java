
public class Main {
    public static void main(String[] args) {
        int account = 300;
        int amount = 1300;
        int bonus = 0;
        if (amount > 1000) {
            bonus = amount / 100;
        }
        int finalBalance = account + amount + bonus;
        System.out.println("Итоговый баланс:" + finalBalance);
        System.out.println("Бонус:" + bonus);

    }


}