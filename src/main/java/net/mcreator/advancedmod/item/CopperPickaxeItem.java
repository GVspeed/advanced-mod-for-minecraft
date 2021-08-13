
package net.mcreator.advancedmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.advancedmod.itemgroup.AddonsItemGroup;
import net.mcreator.advancedmod.AdvancedModModElements;

@AdvancedModModElements.ModElement.Tag
public class CopperPickaxeItem extends AdvancedModModElements.ModElement {
	@ObjectHolder("advanced_mod:copper_pickaxe")
	public static final Item block = null;
	public CopperPickaxeItem(AdvancedModModElements instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1561;
			}

			public float getEfficiency() {
				return 8.5f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CopperIngotItem.block, (int) (1)));
			}
		}, 1, -2f, new Item.Properties().group(AddonsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("copper_pickaxe"));
	}
}
