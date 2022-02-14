package net.notmango.mangotechores.item;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab MANGO_TAB = new CreativeModeTab("mangotechtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TIN_INGOT.get());
        }
    };

    public static final CreativeModeTab MANGO_TAB2 = new CreativeModeTab("mangotechtab2") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.APATITE_PICKAXE.get());
        }
    };
}
