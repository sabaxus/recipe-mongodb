package net.seb.springframework.recipe.services;

import net.seb.springframework.recipe.commands.RecipeCommand;
import net.seb.springframework.recipe.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(String id);

    RecipeCommand findCommandById(String id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(String idToDelete);
}
