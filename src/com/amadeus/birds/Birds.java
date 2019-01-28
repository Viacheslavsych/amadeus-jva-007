public class Birds {
    private String nameOfBird;
    private double priceOfBird;
    private int countOfBird;

    public Birds() {
    }

    public Birds(String nameOfBird, double priceOfBird, int countOfBird) {
        this.nameOfBird = nameOfBird;
        this.priceOfBird = priceOfBird;
        this.countOfBird = countOfBird;
    }

    public String getNameOfBird() {
        return nameOfBird;
    }

    public void setNameOfBird(String nameOfBird) {
        this.nameOfBird = nameOfBird;
    }

    public double getPriceOfBird() {
        return priceOfBird;
    }

    public void setPriceOfBird(double priceOfBird) {
        this.priceOfBird = priceOfBird;
    }

    public int getCountOfBird() {
        return countOfBird;
    }

    public void setCountOfBird(int countOfBird) {
        this.countOfBird = countOfBird;
    }

    @Override
    public String toString() {
        return this.getNameOfBird() + " - " + this.getPriceOfBird() + " - " + this.getCountOfBird();
    }
}