
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.matter.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.matter.world.features.ores.BlockOfShadowMatterFeature;
import net.mcreator.matter.MatterMod;

@Mod.EventBusSubscriber
public class MatterModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MatterMod.MODID);
	public static final RegistryObject<Feature<?>> BLOCK_OF_SHADOW_MATTER = REGISTRY.register("block_of_shadow_matter",
			BlockOfShadowMatterFeature::feature);
}
