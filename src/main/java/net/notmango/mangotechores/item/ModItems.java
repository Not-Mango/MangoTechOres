package net.notmango.mangotechores.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.notmango.mangotechores.MangoTechOres;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MangoTechOres.MOD_ID);

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MANGO_TAB)));

    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MANGO_TAB)));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MANGO_TAB)));

    public static final RegistryObject<Item> RUBY_INGOT = ITEMS.register("ruby_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MANGO_TAB)));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MANGO_TAB)));

    public static final RegistryObject<Item> APATITE = ITEMS.register("apatite",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MANGO_TAB)));

    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModTiers.SAPPHIRE,2,3f,
                    new Item.Properties().tab(ModCreativeModTab.MANGO_TAB2)));

    public static final RegistryObject<Item> APATITE_PICKAXE = ITEMS.register("apatite_pickaxe",
            () -> new PickaxeItem(ModTiers.APATITE,2,3f,
                    new Item.Properties().tab(ModCreativeModTab.MANGO_TAB2)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}