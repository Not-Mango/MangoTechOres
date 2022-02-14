package net.notmango.mangotechores.item;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.notmango.mangotechores.MangoTechOres;

import javax.annotation.Nonnull;

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

    public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MANGO_TAB)));

    public static final RegistryObject<Item> APATITE = ITEMS.register("apatite",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MANGO_TAB)));

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MANGO_TAB)));

    public static final RegistryObject<Item> AQUAMARINE_PICKAXE = ITEMS.register("aquamarine_pickaxe",
            () -> new PickaxeItem(ModTiers.AQUAMARINE,2,3f,
                    new Item.Properties().tab(ModCreativeModTab.MANGO_TAB2)));

    public static final RegistryObject<Item> APATITE_PICKAXE = ITEMS.register("apatite_pickaxe",
            () -> new PickaxeItem(ModTiers.APATITE,0,3f,
                    new Item.Properties().tab(ModCreativeModTab.MANGO_TAB2)));

    public static final RegistryObject<Item> APATITE_SHOVEL = ITEMS.register("apatite_shovel",
            () -> new ShovelItem(ModTiers.APATITE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModTab.MANGO_TAB2)));

    public static final RegistryObject<Item> APATITE_AXE = ITEMS.register("apatite_axe",
            () -> new AxeItem(ModTiers.APATITE, 4, -7f,
                    new Item.Properties().tab(ModCreativeModTab.MANGO_TAB2)));

    public static final RegistryObject<Item> APATITE_HOE = ITEMS.register("apatite_hoe",
            () -> new HoeItem(ModTiers.APATITE, 0, 0f,
                    new Item.Properties().tab(ModCreativeModTab.MANGO_TAB2)));

    public static final RegistryObject<Item> APATITE_SWORD = ITEMS.register("apatite_sword",
            () -> new SwordItem(ModTiers.APATITE, 3, 2f,
                    new Item.Properties().tab(ModCreativeModTab.MANGO_TAB2)));

    public static final RegistryObject<Item> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe",
            () -> new PickaxeItem(ModTiers.TOPAZ,2,3f,
                    new Item.Properties().tab(ModCreativeModTab.MANGO_TAB2)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}