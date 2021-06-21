package fr.kusuuo.oui.init;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.WorldGenRegion;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ModFeatures
{
    public ConfiguredFeature<?, ?> AMETHYSTE_ORE_FEATURE;

    public void init()
    {
        AMETHYSTE_ORE_FEATURE = register("amethyste_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.AMETHYSTE_ORE.get().defaultBlockState(), 6 ))
        .squared()
        .range(5)
        .count(10)
        );


    }
    public <FC extends IFeatureConfig>ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> feature)
    {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, name, feature);
    }

    @SubscribeEvent
    public void biomeLoading(BiomeLoadingEvent e)
    {
        BiomeGenerationSettingsBuilder generation = e.getGeneration();
        if (e.getCategory() != Biome.Category.NETHER)
        {
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, AMETHYSTE_ORE_FEATURE);
        }
    }



}
