import Task.*;

public class Main {
    public static void main(String[] args) {
        Product tomato = new Product("Томат", 130, 4.0);
        Product potato = new Product("Картофель", 55, 4.5);
        Product carrot = new Product("Морковь", 60, 1.5);
        Product cabbage = new Product("Капуста", 99, 1.3);
        Product onion = new Product("Лук", 43, 2.2);
        Product meat = new Product("Мясо", 800, 4.0);
        Product bread = new Product("Хлеб", 67, 1.0);

        listProducts listProducts = new listProducts();


        listProducts.addProduct(tomato);
        listProducts.addProduct(potato);
        listProducts.addProduct(carrot);
        listProducts.addProduct(cabbage);
        listProducts.addProduct(onion);
        listProducts.addProduct(meat);
        listProducts.addProduct(bread);
        listProducts.showInfo();

        listProducts.removeProduct(potato);
        listProducts.showInfo();

        Recipe barbeque = new Recipe("Шашлык");
        barbeque.addProductForRecipe(meat);
        barbeque.addProductForRecipe(onion);

        System.out.println(barbeque);

        Recipe saladVegetable = new Recipe("Овощной салат");
        saladVegetable.addProductForRecipe(cabbage);
        saladVegetable.addProductForRecipe(carrot);
        saladVegetable.addProductForRecipe(tomato);
        saladVegetable.addProductForRecipe(onion);

        System.out.println(saladVegetable);

        Recipe vegetableVegetable = new Recipe("Овощной");
        vegetableVegetable.addProductForRecipe(cabbage);
        vegetableVegetable.addProductForRecipe(carrot);
        vegetableVegetable.addProductForRecipe(tomato);
        vegetableVegetable.addProductForRecipe(onion);


        System.out.println(vegetableVegetable);

        SetRecipe setRecipe = new SetRecipe();
        setRecipe.addRecipe(barbeque);
        setRecipe.addRecipe(saladVegetable);
        setRecipe.addRecipe(vegetableVegetable);

        setRecipe.printSetRecipe();

        IteratorInteger iteratorInteger = new IteratorInteger();

        iteratorInteger.generationNumbers();
        System.out.printf(String.valueOf(iteratorInteger));
        System.out.println();

        iteratorInteger.removeNumbers();
        System.out.println(iteratorInteger);


    }
}


