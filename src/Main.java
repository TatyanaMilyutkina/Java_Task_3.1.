public class Main {

    public static void main(String[] args) {
        BonusMilesService BonusMilesService = new BonusMilesService();
        BonusMilesService check = new BonusMilesService();

        int onCheck = 1300;
        int inReplenishmentMain = 1001;

        int bonus = BonusMilesService.BonusMilesService(onCheck, inReplenishmentMain);
        System.out.println("Итого начислено бонусов:" + bonus);
        int finalCheck = check.Check(onCheck, inReplenishmentMain, bonus);
        System.out.println("Итого на счете клиента:" + finalCheck);
    }
}
