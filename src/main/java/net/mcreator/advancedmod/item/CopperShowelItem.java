
package net.mcreator.advancedmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.advancedmod.itemgroup.AddonsItemGroup;
import net.mcreator.advancedmod.AdvancedModModElements;

@AdvancedModModElements.ModElement.Tag
public class CopperShowelItem extends AdvancedModModElements.ModElement {
	@ObjectHolder("advanced_mod:copper_showel")
	public static final Item block = null;
	public CopperShowelItem(AdvancedModModElements instance) {
		super(instance, 65);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CopperIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(AddonsItemGroup.tab)) {
		}.setRegistryName("copper_showel"));
	}
}
