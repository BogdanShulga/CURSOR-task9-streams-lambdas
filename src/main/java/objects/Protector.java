package main.java.objects;

public class Protector {
    private Thing thing;

    public Protector(Thing thing) {
        this.thing = thing;
    }

    @Override
    public String toString() {
        return "\n" + "Protector{"
                + thing +
                '}';
    }
}
