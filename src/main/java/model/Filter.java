package model;

public interface Filter<T> {
    boolean apply(T o);
}
