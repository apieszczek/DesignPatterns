package pl.codecouple;

/**
 * Created by CodeCouple.pl
 */
class NaughtyChristmasPackBuilder implements ChristmasPackBuilder {

    private ChristmasPack christmasPack;

    NaughtyChristmasPackBuilder() {
        christmasPack = new ChristmasPack();
    }

    public void addPresent() {
        Present present = new Present();
        present.setKind("coal");
        present.setAmount(1000);
        present.setPrice(50.5);
        christmasPack.setPresent(present);
    }

    public void addWrapping() {
        Wrapping wrapping = new Wrapping();
        wrapping.setColor("black");
        wrapping.setPrice(0.2);
        christmasPack.setWrapping(wrapping);
    }

    public ChristmasPack getChristmasPack() {
        return christmasPack;
    }
}
