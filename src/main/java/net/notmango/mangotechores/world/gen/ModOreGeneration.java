package net.notmango.mangotechores.world.gen;

import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.notmango.mangotechores.world.feature.ModPlacedFeatures;

import java.util.List;
import java.util.function.Supplier;

public class ModOreGeneration {

    public static void generateOres(final BiomeLoadingEvent event) {
        List<Supplier<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(() -> ModPlacedFeatures.APATITE_ORE_PLACED);
        base.add(() -> ModPlacedFeatures.AQUAMARINE_ORE_PLACED);
        base.add(() -> ModPlacedFeatures.TOPAZ_ORE_PLACED);
        base.add(() -> ModPlacedFeatures.TIN_ORE_PLACED);
    }
}
