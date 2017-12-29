package pl.codecouple;

/**
 * Created by CodeCouple.pl
 */
class Wrapping {

    private String color;
    private double price;

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n\t\tcolor: " + color + "\n\t\t" +
                "price: " + price;
    }
}
