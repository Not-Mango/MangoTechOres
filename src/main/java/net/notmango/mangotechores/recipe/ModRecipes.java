package net.notmango.mangotechores.recipe;

import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.notmango.mangotechores.MangoTechOres;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MangoTechOres.MOD_ID);

    public static final RegistryObject<RecipeSerializer<CompoundFurnaceRecipe>> COMPOUND_FURNACE_SERIALIZER =
            SERIALIZERS.register("compound_smelting", () -> CompoundFurnaceRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        Registry.register(Registry.RECIPE_TYPE, CompoundFurnaceRecipe.Type.ID, CompoundFurnaceRecipe.Type.INSTANCE);
    }
}