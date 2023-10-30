import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        CreditService service = new CreditService();

        System.out.println("Ваш ежемесячный платеж при сроке кредита на 12 месяцев, с процентной ставкой в 9,99, составляет ");
        System.out.println(service.creditCalc(9.99, 12, 1_000_000));
            // 87_911 rub - 12 months
        System.out.println("Ваш ежемесячный платеж при сроке кредита на 24 месяца, с процентной ставкой в 9,99, составляет ");
        System.out.println(service.creditCalc(9.99, 24, 1_000_000));
            // 46_140 rub - 24 months
        System.out.println("Ваш ежемесячный платеж при сроке кредита на 36 месяцев, с процентной ставкой в 9,99, составляет ");
        System.out.println(service.creditCalc(9.99, 36, 1_000_000));
        // 32_262 rub - 36 months
    }
}