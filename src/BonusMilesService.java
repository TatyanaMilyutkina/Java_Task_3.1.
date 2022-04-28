public class BonusMilesService {

    public int BonusMilesService(int check, int inReplenishment) {
        boolean sum = inReplenishment > 1000;
        int bonus = sum ? inReplenishment / 100 : 0;
        int sum2 = check + inReplenishment + bonus;
        return bonus;
    }

    public int Check(int check, int inReplenishment, int bonus) {
        int check1 = check + inReplenishment + bonus;
        return check1;
    }
}

