package net.notmango.mangotechores.containers;

import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.notmango.mangotechores.MangoTechOres;

public class ModContainers {

    public static final DeferredRegister<MenuType<?>> CONTAINERS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, MangoTechOres.MOD_ID);



    public static void register(IEventBus eventBus) {
        CONTAINERS.register(eventBus);
    }
}
