package main.java.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Box {
    private List<Thing> things = new ArrayList<>();

    private Box() {
        fillThings();
    }

    private void fillThings() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            things.add(new Thing(random.nextBoolean()));
        }
    }

    public List<Thing> getThings() {
        return things;
    }

    public static List<Box> getBoxes() {
        List<Box> boxes = new ArrayList<>();
        for (int i = 0; i < 5; i++) boxes.add(new Box());
        return boxes;
    }

    @Override
    public String toString() {
        return "\n" + "Box{" +
                "things=" + things +
                '}';
    }
}
