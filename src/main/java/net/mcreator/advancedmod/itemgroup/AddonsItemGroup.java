
package net.mcreator.advancedmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.advancedmod.block.CopperBlock;
import net.mcreator.advancedmod.AdvancedModModElements;

@AdvancedModModElements.ModElement.Tag
public class AddonsItemGroup extends AdvancedModModElements.ModElement {
	public AddonsItemGroup(AdvancedModModElements instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabaddons") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CopperBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
