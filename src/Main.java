import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        CreditService service = new CreditService();
        BigDecimal result = new BigDecimal(annuityRatio);
        result = result.setScale(3, RoundingMode.UP);

        int creditAmountRub = 1_000_000;

        System.out.println("Ваш ежемесячный платеж при сроке кредита на 12 месяцев, с процентной ставкой в 9,99, составляет ");
        System.out.println(service.creditCalc(9.99, 12)*creditAmountRub);

        System.out.println("Ваш ежемесячный платеж при сроке кредита на 24месяца, с процентной ставкой в 9,99, составляет ");
        System.out.println(service.creditCalc(9.99, 24)*creditAmountRub);

        System.out.println("Ваш ежемесячный платеж при сроке кредита на 36месяцев, с процентной ставкой в 9,99, составляет ");
        System.out.println(service.creditCalc(9.99, 36)*creditAmountRub);
    }
}