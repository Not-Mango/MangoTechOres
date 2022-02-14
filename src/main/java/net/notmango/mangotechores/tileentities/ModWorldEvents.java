package net.notmango.mangotechores.tileentities;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.notmango.mangotechores.MangoTechOres;
import net.notmango.mangotechores.world.gen.ModOreGeneration;


@Mod.EventBusSubscriber(modid = MangoTechOres.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
    }
}