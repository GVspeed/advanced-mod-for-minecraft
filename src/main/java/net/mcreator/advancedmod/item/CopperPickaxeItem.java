
package net.mcreator.advancedmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.player.PlayerEntity;

import net.mcreator.advancedmod.procedures.CopperPickaxeRightClickedInAirProcedure;
import net.mcreator.advancedmod.itemgroup.AddonsItemGroup;
import net.mcreator.advancedmod.AdvancedModModElements;

import java.util.Map;
import java.util.HashMap;

@AdvancedModModElements.ModElement.Tag
public class CopperPickaxeItem extends AdvancedModModElements.ModElement {
	@ObjectHolder("advanced_mod:copper_pickaxe")
	public static final Item block = null;
	public CopperPickaxeItem(AdvancedModModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(AddonsItemGroup.tab)) {
			@Override
			public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
				ActionResult<ItemStack> retval = super.onItemRightClick(world, entity, hand);
				ItemStack itemstack = retval.getResult();
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					CopperPickaxeRightClickedInAirProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("copper_pickaxe"));
	}
}
