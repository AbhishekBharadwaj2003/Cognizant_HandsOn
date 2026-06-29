public class FinancialForecast {

    public static double futureValue(double currentValue,
                                     double growthRate,
                                     int years) {

        if(years == 0)
            return currentValue;

        return futureValue(currentValue * (1 + growthRate),
                           growthRate,
                           years - 1);
    }

    public static void main(String[] args) {

        double current = 10000;
        double growth = 0.10;
        int years = 5;

        double result = futureValue(current,growth,years);

        System.out.printf("Future Value = %.2f",result);
    }
}