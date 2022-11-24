package Task;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private Set<Product> productForRecipe = new HashSet<>();
    private double sumOfProducts;
    private String nameRecipe;

    public Recipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;

    }

    public void addProductForRecipe (Product product){
        productForRecipe.add(product);
    }

    public Double sumOfProducts() {
        for (Product product:productForRecipe) {
            this.sumOfProducts = this.sumOfProducts + product.getPrice() * product.getQuantity();
        }
        return sumOfProducts;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(nameRecipe, recipe.nameRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipe);
    }

    @Override
    public String toString() {
        return nameRecipe + " состав : " + productForRecipe + ", стоимость продуктов составила " + sumOfProducts() + "руб.";
    }
}
