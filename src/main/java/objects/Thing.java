package main.java.objects;

public class Thing {
    private boolean fragile;

    Thing(boolean fragile) {
        this.fragile = fragile;
    }

    public boolean isFragile() {
        return fragile;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "fragile=" + fragile +
                '}';
    }
}
