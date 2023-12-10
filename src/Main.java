
public class Main {

    static int account = 300;

    public static void main(String[] args) {

        inputHandler(300);
        System.out.println("Итоговая сумма на счету:" + account);

        inputHandler(1200);
        System.out.println("Итоговая сумма на счету:" + account);
    }

    static void inputHandler(int amount) {
        if (amount > 1000){
            account += amount;
            int bonus = amount / 100;
            account += bonus;
        } else {
            account += amount;
        }
    }
}