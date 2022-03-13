package net.notmango.mangotechores.item;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.notmango.mangotechores.block.ModBlocks;

public class ModCreativeModTab {
    public static final CreativeModeTab MANGO_BLOCKS = new CreativeModeTab("mangotechtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.APATITE_BLOCK.get());
        }
    };

    public static final CreativeModeTab MANGO_ORES = new CreativeModeTab("mangotechtab2") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.APATITE_ORE.get());
        }
    };

    public static final CreativeModeTab MANGO_INGOTS = new CreativeModeTab("mangotechtab3") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.APATITE.get());
        }
    };

    public static final CreativeModeTab MANGO_TOOLS = new CreativeModeTab("mangotechtab4") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.APATITE_AXE.get());
        }
    };

    public static final CreativeModeTab MANGO_MACHINES = new CreativeModeTab("mangotechtab5") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.COMPOUND_FURNACE.get());
        }
    };
}
