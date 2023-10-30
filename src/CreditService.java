public class CreditService {
    public double creditCalc(double creditRate, int periodMonths, int creditAmountRub) {

        double creditMonthRatePercent =  creditRate/ (100 * 12);
        double annuityRatioFirstPart = (creditMonthRatePercent * Math.pow ((1 + creditMonthRatePercent), periodMonths));
        double annuityRatioSecond = Math.pow((1 + creditMonthRatePercent),periodMonths)-1;
        double annuityRatio = annuityRatioFirstPart / annuityRatioSecond;
        int monthAnnuityPayment = (int) ((double) annuityRatio * creditAmountRub);

        return monthAnnuityPayment;
    }
}
