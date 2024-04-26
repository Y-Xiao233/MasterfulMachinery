package io.ticticboom.mods.mm.port;

import io.ticticboom.mods.mm.recipe.RecipeStorages;
import net.minecraft.world.level.Level;

import java.util.List;

public interface IPortIngredient {
    boolean canProcess(Level level, RecipeStorages storages);
    void process(Level level, RecipeStorages storages);
    boolean canOutput(Level level, RecipeStorages storages);
    void output(Level level, RecipeStorages storages);
}
