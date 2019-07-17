package main.java.objects;

import main.java.interfaces.Changeable;

import java.util.List;

public class ChangeableList<T> {

    private List<T> list;

    public ChangeableList(List<T> list) {
        this.list = list;
    }

    public void changeAll(Changeable<T> changeable) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, changeable.change(list.get(i)));
        }
    }

    public List<T> getList() {
        return list;
    }
}
