import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int numberOfDeposits = Integer.parseInt(string);
        List<Deposit> deposits = new ArrayList<>();

        for (int i = 0; i < numberOfDeposits; i++) {
            String depositLine = scanner.nextLine();
            String[] data = depositLine.split(" ");
            double amount = Double.parseDouble(data[0]);
            double rate = Double.parseDouble(data[1]);
            int age = Integer.parseInt(data[2]);
            Deposit deposit = new Deposit(amount, rate, age);
            deposits.add(deposit);
        }

        Calculator calculator = new Calculator();
        Result result = calculator.calculateInfoAboutDeposits(deposits);


        System.out.println(result);

        List<Double> profits = result.getAllProfits();

        for (Double profit : profits) {
            System.out.println("Вклад заработал: " + profit);
        }

    }
}
