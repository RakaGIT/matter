
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.matter.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.matter.block.BlockOfShadowMatterBlock;
import net.mcreator.matter.MatterMod;

public class MatterModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MatterMod.MODID);
	public static final RegistryObject<Block> BLOCK_OF_SHADOW_MATTER = REGISTRY.register("block_of_shadow_matter",
			() -> new BlockOfShadowMatterBlock());
}
