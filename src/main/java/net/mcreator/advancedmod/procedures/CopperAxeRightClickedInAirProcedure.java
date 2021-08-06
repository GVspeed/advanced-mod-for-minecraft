package net.mcreator.advancedmod.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;

import net.mcreator.advancedmod.AdvancedModModElements;
import net.mcreator.advancedmod.AdvancedModMod;

import java.util.Map;

@AdvancedModModElements.ModElement.Tag
public class CopperAxeRightClickedInAirProcedure extends AdvancedModModElements.ModElement {
	public CopperAxeRightClickedInAirProcedure(AdvancedModModElements instance) {
		super(instance, 39);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				AdvancedModMod.LOGGER.warn("Failed to load dependency itemstack for procedure CopperAxeRightClickedInAir!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.SHARPNESS, (int) 10);
	}
}
