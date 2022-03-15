package net.notmango.mangotechores.world.feature;

import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.notmango.mangotechores.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeature {


    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_APATITE_ORE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.APATITE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_APATITE_ORE.get()
                    .defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_AQUAMARINE_ORE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.AQUAMARINE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_AQUAMARINE_ORE.get()
                    .defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TOPAZ_ORE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TOPAZ_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TOPAZ_ORE.get()
                    .defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TIN_ORE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TIN_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TIN_ORE.get()
                    .defaultBlockState()));



    public static final ConfiguredFeature<?, ?> APATITE_ORE = FeatureUtils.register("apatite_ore",
            Feature.ORE.configured(new OreConfiguration(OVERWORLD_APATITE_ORE, 4)));

    public static final ConfiguredFeature<?, ?> AQUAMARINE_ORE = FeatureUtils.register("aquamarine_ore",
            Feature.ORE.configured(new OreConfiguration(OVERWORLD_AQUAMARINE_ORE, 4)));

    public static final ConfiguredFeature<?, ?> TOPAZ_ORE = FeatureUtils.register("topaz_ore",
            Feature.ORE.configured(new OreConfiguration(OVERWORLD_TOPAZ_ORE, 4)));

    public static final ConfiguredFeature<?, ?> TIN_ORE = FeatureUtils.register("tin_ore",
            Feature.ORE.configured(new OreConfiguration(OVERWORLD_TIN_ORE, 4)));
}
