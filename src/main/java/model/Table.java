package model;

import java.util.Objects;

public class Table implements Detector{
    private String type;
    private String color;
    private double price;

    public Table() {
    }

    public Table(String type, String color, double price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return Double.compare(table.price, price) == 0 &&
                Objects.equals(type, table.type) &&
                Objects.equals(color, table.color);
    }

    @Override
    public boolean detect() {
        return this.price > 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, color, price);
    }

    @Override
    public String toString() {
        return "Table{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
