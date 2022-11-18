
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.matter.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.matter.item.ShadowMatterItem;
import net.mcreator.matter.MatterMod;

public class MatterModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MatterMod.MODID);
	public static final RegistryObject<Item> SHADOW_MATTER = REGISTRY.register("shadow_matter", () -> new ShadowMatterItem());
	public static final RegistryObject<Item> BLOCK_OF_SHADOW_MATTER = block(MatterModBlocks.BLOCK_OF_SHADOW_MATTER, MatterModTabs.TAB_MATTER);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
