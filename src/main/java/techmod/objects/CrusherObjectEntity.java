package techmod.objects;

import necesse.engine.registries.RecipeTechRegistry;
import necesse.entity.objectEntity.AnyLogFueledProcessingTechInventoryObjectEntity;
import necesse.inventory.InventoryItem;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Tech;
import necesse.level.maps.Level;
import techmod.TechMod;

public class CrusherObjectEntity extends AnyLogFueledProcessingTechInventoryObjectEntity {
    public static int logFuelTime = 16000;
    public static int recipeProcessTime = 8000;

    public CrusherObjectEntity(Level level, int x, int y) {
        super(level, "crusher", x, y, 2, 2, false, false, true, new Tech[]{TechMod.CRUSHER});
    }

    public int getFuelTime(InventoryItem item) {
        return logFuelTime;
    }

    public int getProcessTime(Recipe recipe) {
        return recipeProcessTime;
    }
}