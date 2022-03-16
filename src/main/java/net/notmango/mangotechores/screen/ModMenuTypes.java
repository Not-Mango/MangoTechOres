package net.notmango.mangotechores.screen;

import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.notmango.mangotechores.MangoTechOres;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, MangoTechOres.MOD_ID);

    public static final RegistryObject<MenuType<CompoundFurnaceMenu>> COMPOUND_FURNACE_MENU =
            registerMenuType(CompoundFurnaceMenu::new, "compound_furnace_menu");

    public static final RegistryObject<MenuType<ObliteratorMenu>> OBLITERATOR_MENU =
            registerMenuType(ObliteratorMenu::new, "obliterator_menu");



    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory,
                                                                                                  String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
