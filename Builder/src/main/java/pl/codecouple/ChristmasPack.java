package pl.codecouple;

/**
 * Created by CodeCouple.pl
 */
class ChristmasPack {

    private Present present;
    private Wrapping wrapping;

    public void setPresent(Present present) {
        this.present = present;
    }

    public void setWrapping(Wrapping wrapping) {
        this.wrapping = wrapping;
    }

    @Override
    public String toString() {
        return "ChristmasPack: \n\t" +
                "present: " + present + "\n\t" +
                "wrapping: " + wrapping;
    }
}
