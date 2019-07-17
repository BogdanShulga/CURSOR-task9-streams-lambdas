package main.java.interfaces;

@FunctionalInterface
public interface Changeable <T> {
    T change(T object);
}
