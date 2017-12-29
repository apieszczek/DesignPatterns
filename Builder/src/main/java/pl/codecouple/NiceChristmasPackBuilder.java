package pl.codecouple;

/**
 * Created by CodeCouple.pl
 */
class NiceChristmasPackBuilder implements ChristmasPackBuilder {

    private ChristmasPack christmasPack;

    NiceChristmasPackBuilder() {
        christmasPack = new ChristmasPack();
    }

    public void addPresent() {
        Present present = new Present();
        present.setKind("toys");
        present.setAmount(10);
        present.setPrice(1200.2);
        christmasPack.setPresent(present);
    }

    public void addWrapping() {
        Wrapping wrapping = new Wrapping();
        wrapping.setColor("gold");
        wrapping.setPrice(6.3);
        christmasPack.setWrapping(wrapping);
    }

    public ChristmasPack getChristmasPack() {
        return christmasPack;
    }
}
