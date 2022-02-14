package net.notmango.mangotechores.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {

    public static final ForgeTier SAPPHIRE = new ForgeTier(2,500,1f,
            3f, 10, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.SAPPHIRE.get()));

    public static final ForgeTier RUBY = new ForgeTier(2,500,1f,
            3f, 10, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.RUBY.get()));
}
