import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public Result calculateInfoAboutDeposits(List<Deposit> deposits) {
        double averageProfit = calculateAverageProfit(deposits);
        int maxIndex = calculateMaxIndex(deposits);
        List<Double> profits = calculateListOfProfits(deposits);

        return new Result(maxIndex, averageProfit, profits);
    }

    private double calculateAverageProfit(List<Deposit> deposits) {
        double sumOfProfits = 0.0;

        for (int i = 0; i < deposits.size(); i++) {
            Deposit deposit = deposits.get(i);
            double profit = deposit.getProfit();
            sumOfProfits += profit;
        }

        double averageProfit = sumOfProfits / deposits.size();
        return averageProfit;
    }

    private int calculateMaxIndex(List<Deposit> deposits) {
        double maxProfit = Double.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < deposits.size(); i++) {
            Deposit deposit = deposits.get(i);
            double profit = deposit.getProfit();

            if (profit > maxProfit) {
                maxProfit = profit;
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    private List<Double> calculateListOfProfits(List<Deposit> deposits) {
        List<Double> profits = new ArrayList<>();

        for (int i = 0; i < deposits.size(); i++) {
            Deposit deposit = deposits.get(i);
            double profit = deposit.getProfit();

            profits.add(profit);
        }

        return profits;
    }
}
