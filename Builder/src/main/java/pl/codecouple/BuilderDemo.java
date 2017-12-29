package pl.codecouple;

/**
 * Created by CodeCouple.pl
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Packer packer = new Packer(new NaughtyChristmasPackBuilder());
        ChristmasPack christmasPack = packer.createChristmasPack();
        System.out.println(christmasPack.toString());

        packer = new Packer(new NiceChristmasPackBuilder());
        christmasPack = packer.createChristmasPack();
        System.out.println(christmasPack.toString());
    }
}
