package Task;

import java.util.HashSet;
import java.util.Set;

public class SetRecipe {
    private Set<Recipe> setRecipe = new HashSet<>();

    public SetRecipe() {
    }

    public void addRecipe(Recipe recipe) {
        if (!setRecipe.contains(recipe)) {
            setRecipe.add(recipe);
        } else {
            throw new RuntimeException("Рецепт " + recipe.getNameRecipe() + " уже имеется в списке!");
        }
    }

    public void printSetRecipe(){
        for (Recipe recipe:
                setRecipe) {
            System.out.println(recipe.getNameRecipe());
        }
    }
}
