package net.notmango.mangotechores;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.notmango.mangotechores.block.ModBlocks;
import net.notmango.mangotechores.block.entity.ModBlockEntities;
import net.notmango.mangotechores.enchantment.ModEnchantment;
import net.notmango.mangotechores.fluid.ModFluids;
import net.notmango.mangotechores.item.ModItems;

import net.notmango.mangotechores.screen.CompoundFurnaceScreen;
import net.notmango.mangotechores.screen.ModMenuTypes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MangoTechOres.MOD_ID)
public class MangoTechOres
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mangotechores";

    public MangoTechOres() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModEnchantment.register(eventBus);
        ModFluids.register(eventBus);

        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModFluids.OIL_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.OIL_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.OIL_FLOWING.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COMPOUND_FURNACE.get(), RenderType.cutout());

        MenuScreens.register(ModMenuTypes.COMPOUND_FURNACE_MENU.get(), CompoundFurnaceScreen::new);
    }
}
