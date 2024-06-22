public class Deposit {

    private double amount;

    private double rate;

    private int age;

    public Deposit(double amount, double rate, int age) {
        this.amount = amount;
        this.rate = rate;
        this.age = age;
    }

    public double getProfit() {
        //double result = Math.pow(rate, age) * amount - amount;

        double myAmount = amount;
        double realRate = rate / 100 + 1;
        for (int i = 0; i < age; i++) {
            myAmount = myAmount * realRate;
        }

        return myAmount - amount;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "amount=" + amount +
                ", rate=" + rate +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deposit deposit = (Deposit) o;

        if (Double.compare(amount, deposit.amount) != 0) return false;
        if (Double.compare(rate, deposit.rate) != 0) return false;
        return age == deposit.age;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(amount);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + age;
        return result;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
