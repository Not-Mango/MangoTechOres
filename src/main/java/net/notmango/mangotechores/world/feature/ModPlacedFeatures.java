package net.notmango.mangotechores.world.feature;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {

    public static final PlacedFeature APATITE_ORE_PLACED = PlacementUtils.register("apatite_ore_placed",
            ModConfiguredFeature.APATITE_ORE.placed(ModOrePlacement.commonOrePlacement(6,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-30), VerticalAnchor.aboveBottom(180)))));

    public static final PlacedFeature AQUAMARINE_ORE_PLACED = PlacementUtils.register("aquamarine_ore_placed",
            ModConfiguredFeature.AQUAMARINE_ORE.placed(ModOrePlacement.commonOrePlacement(6,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-30), VerticalAnchor.aboveBottom(180)))));

    public static final PlacedFeature TOPAZ_ORE_PLACED = PlacementUtils.register("topaz_ore_placed",
            ModConfiguredFeature.TOPAZ_ORE.placed(ModOrePlacement.commonOrePlacement(6,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-30), VerticalAnchor.aboveBottom(180)))));
}
