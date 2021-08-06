
package net.mcreator.advancedmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.advancedmod.itemgroup.AddonsItemGroup;
import net.mcreator.advancedmod.AdvancedModModElements;

@AdvancedModModElements.ModElement.Tag
public class CopperIngotItem extends AdvancedModModElements.ModElement {
	@ObjectHolder("advanced_mod:copper_ingot")
	public static final Item block = null;
	public CopperIngotItem(AdvancedModModElements instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(AddonsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("copper_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
