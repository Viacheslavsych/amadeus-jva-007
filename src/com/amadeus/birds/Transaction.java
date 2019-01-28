import java.util.Date;

public class Transaction {
    private String clientName;
    private String birdName;
    private double priceOfBird;
    private Date date;
    private int count;

    public Transaction(String clientName, String birdName, double priceOfBird, int count, Date date) {
        this.clientName = clientName;
        this.birdName = birdName;
        this.priceOfBird = priceOfBird;
        this.count = count;
        this.date = date;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public Double getPriceOfBird() {
        return priceOfBird;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPriceOfBird(double priceOfBird) {
        this.priceOfBird = priceOfBird;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return this.getClientName() + " bought " + this.count + " " + this.birdName + " in " + this.date + " by price " + (this.priceOfBird * this.count) + " USD";
    }
}