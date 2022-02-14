package net.notmango.mangotechores.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.notmango.mangotechores.MangoTechOres;
import net.notmango.mangotechores.item.ModCreativeModTab;
import net.notmango.mangotechores.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, MangoTechOres.MOD_ID);

    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f, 3f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModTab.MANGO_TAB);

    public static final RegistryObject<Block> APATITE_ORE = registerBlock("apatite_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f, 3f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModTab.MANGO_TAB);

    public static final RegistryObject<Block> DEEPSLATE_APATITE_ORE = registerBlock("deepslate_apatite_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.DEEPSLATE)
                    .strength(3f, 4.5f).sound(SoundType.DEEPSLATE)
                    .requiresCorrectToolForDrops()),
            ModCreativeModTab.MANGO_TAB);

    public static final RegistryObject<Block> APATITE_BLOCK = registerBlock("apatite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f, 6f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()),
            ModCreativeModTab.MANGO_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
