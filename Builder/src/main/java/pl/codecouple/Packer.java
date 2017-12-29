package pl.codecouple;

/**
 * Created by CodeCouple.pl
 */
class Packer {
    private final ChristmasPackBuilder christmasPackBuilder;

    public Packer(ChristmasPackBuilder builder) {
        christmasPackBuilder = builder;
    }

    public ChristmasPack createChristmasPack() {
        christmasPackBuilder.addPresent();
        christmasPackBuilder.addWrapping();
        return christmasPackBuilder.getChristmasPack();
    }
}
