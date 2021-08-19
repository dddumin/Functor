package model;

import java.util.Objects;

public class Chair implements Detector {
    private String type;
    private String color;
    private double price;

    public Chair(String type, String color, double price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean detect() {
        return this.price > 50;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return Double.compare(chair.price, price) == 0 &&
                Objects.equals(type, chair.type) &&
                Objects.equals(color, chair.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, color, price);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
