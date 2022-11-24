package Task;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private double quantity;


    public Product(String name, double price, double quantity) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null || !name.isEmpty()) {
            this.name = name;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью!");
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price != 0) {
            this.price = price;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью!");
        }
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        if(quantity > 0) {
            this.quantity = quantity;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Product {" +
                name +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

