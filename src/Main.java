public class Main {
    public static void main(String[] args) {
        long balance = 100;
        int bonus = 0;
        int bonusParams = 100;
        float pay = 3000;

        if (pay >= 1000){
            bonus= (int) (pay/bonusParams);
        }

        balance= (long) (balance+pay+bonus);

        System.out.println("Общий баланс = "+ balance + "рублей.");
        System.out.println("Пополнение произведено на "+ pay +
                " рублей, начислено "+bonus+" бонусных рублей.");
    }
}
