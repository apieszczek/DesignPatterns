package pl.codecouple;

/**
 * Created by CodeCouple.pl
 */
class Present {

    private String kind;
    private int amount;
    private double price;

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n\t\tkind: " + kind + "\n\t\t" +
                "amount: " + amount + "\n\t\t" +
                "price: " + price;
    }
}
