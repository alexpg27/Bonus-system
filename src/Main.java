public class Main {
    public static void main(String[] args) {
        int clientCurrentAccount = 100;
        int accountReplenishment = 1100;
        int clientBonuses = 0;

        if (accountReplenishment <= 1000) {
            clientCurrentAccount += accountReplenishment;
            System.out.println("Итоговый бонус = " + clientBonuses);
        } else if (accountReplenishment > 1000) {
            clientBonuses = accountReplenishment / 100;
            clientCurrentAccount += accountReplenishment + clientBonuses;
            System.out.println("Итоговый бонус = " + clientBonuses);
        }


    }
}
