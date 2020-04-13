package controller;

import java.util.Objects;

public class Product {
    //https://www.youtube.com/watch?v=_qCEotOOCiM
    String name;
    private long id = -1;
    static long counter = 1;
    double price;

    double discount;
    String description = "";

    public Product(String name, double price) {
        id = counter++;
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, double discount) {
        id = counter++;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public Product(String name, double price, String description) {
        id = counter++;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Product(String name, double price, double discount, String description) {
        id = counter++;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price*discount;
    }

    public double getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                Double.compare(product.price, price) == 0 &&
                Double.compare(product.discount, discount) == 0 &&
                Objects.equals(name, product.name) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, price, discount, description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", discount=" + discount +
                ", description='" + description + '\'' +
                '}';
    }
}
