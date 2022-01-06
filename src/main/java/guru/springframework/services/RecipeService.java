package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by Bilal Djaghout on 12/16/2021
 */

public interface RecipeService {
    Set<Recipe> getRecipes();
}
