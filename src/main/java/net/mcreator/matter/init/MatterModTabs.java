
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.matter.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MatterModTabs {
	public static CreativeModeTab TAB_MATTER;

	public static void load() {
		TAB_MATTER = new CreativeModeTab("tabmatter") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MatterModItems.SHADOW_MATTER.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
