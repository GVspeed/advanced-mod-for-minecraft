package net.mcreator.advancedmod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.advancedmod.AdvancedModModElements;
import net.mcreator.advancedmod.AdvancedModMod;

import java.util.Map;

@AdvancedModModElements.ModElement.Tag
public class CopperPickaxeRightClickedInAirProcedure extends AdvancedModModElements.ModElement {
	public CopperPickaxeRightClickedInAirProcedure(AdvancedModModElements instance) {
		super(instance, 37);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AdvancedModMod.LOGGER.warn("Failed to load dependency x for procedure CopperPickaxeRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AdvancedModMod.LOGGER.warn("Failed to load dependency y for procedure CopperPickaxeRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AdvancedModMod.LOGGER.warn("Failed to load dependency z for procedure CopperPickaxeRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AdvancedModMod.LOGGER.warn("Failed to load dependency world for procedure CopperPickaxeRightClickedInAir!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.POTTED_BAMBOO.getDefaultState(), 3);
	}
}
