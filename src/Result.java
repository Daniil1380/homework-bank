import java.util.List;
import java.util.Objects;

public class Result {

    private int indexOfMaxProfitDeposit;

    private double averageProfitByDeposits;

    private List<Double> allProfits;

    public Result(int indexOfMaxProfitDeposit, double averageProfitByDeposits, List<Double> allProfits) {
        this.indexOfMaxProfitDeposit = indexOfMaxProfitDeposit;
        this.averageProfitByDeposits = averageProfitByDeposits;
        this.allProfits = allProfits;
    }

    @Override
    public String toString() {
        return "Result{" +
                "indexOfMaxProfitDeposit=" + indexOfMaxProfitDeposit +
                ", averageProfitByDeposits=" + averageProfitByDeposits +
                ", allProfits=" + allProfits +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Result result = (Result) o;

        if (indexOfMaxProfitDeposit != result.indexOfMaxProfitDeposit) return false;
        if (Double.compare(averageProfitByDeposits, result.averageProfitByDeposits) != 0) return false;
        return Objects.equals(allProfits, result.allProfits);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = indexOfMaxProfitDeposit;
        temp = Double.doubleToLongBits(averageProfitByDeposits);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (allProfits != null ? allProfits.hashCode() : 0);
        return result;
    }

    public int getIndexOfMaxProfitDeposit() {
        return indexOfMaxProfitDeposit;
    }

    public void setIndexOfMaxProfitDeposit(int indexOfMaxProfitDeposit) {
        this.indexOfMaxProfitDeposit = indexOfMaxProfitDeposit;
    }

    public double getAverageProfitByDeposits() {
        return averageProfitByDeposits;
    }

    public void setAverageProfitByDeposits(double averageProfitByDeposits) {
        this.averageProfitByDeposits = averageProfitByDeposits;
    }

    public List<Double> getAllProfits() {
        return allProfits;
    }

    public void setAllProfits(List<Double> allProfits) {
        this.allProfits = allProfits;
    }
}
