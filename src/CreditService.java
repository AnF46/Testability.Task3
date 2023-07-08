public class CreditService {
    public double creditCalc(double creditRate, int periodMonths) {

        double creditMonthRatePercent =  creditRate/ periodMonths / 100;
        double annuityRatio = (Math.pow(creditMonthRatePercent * (1 + creditMonthRatePercent),periodMonths) / Math.pow(((1 + creditMonthRatePercent)),periodMonths)-1);

        return annuityRatio;
    }

}
