package Task;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class listProducts {
    private Set<Product> set = new HashSet<>();

    public listProducts() {
    }


    public void addProduct(Product product) {
        if (!set.contains(product)) {
            set.add(product);
        } else {
            throw new RuntimeException("Продукт " + product.getName()+ " в корзине!");
        }
    }

    public void removeProduct(Product product){
        Iterator<Product> productIterator = this.set.iterator();
        while (productIterator.hasNext()){
            if(productIterator.next().getName().equals(product.getName())) {
                productIterator.remove();
                break;
            }
        }
    }

    public void showInfo (){
        System.out.println("Список продуктов");
        for (Product product:set) {
            System.out.println(product.getName() + " " + product.getQuantity() + " кг, " + product.getPrice() + " руб.");
        }

    }


}