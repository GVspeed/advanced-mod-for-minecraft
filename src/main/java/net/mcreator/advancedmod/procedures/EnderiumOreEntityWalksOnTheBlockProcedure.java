package net.mcreator.advancedmod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.advancedmod.AdvancedModModElements;
import net.mcreator.advancedmod.AdvancedModMod;

import java.util.Map;

@AdvancedModModElements.ModElement.Tag
public class EnderiumOreEntityWalksOnTheBlockProcedure extends AdvancedModModElements.ModElement {
	public EnderiumOreEntityWalksOnTheBlockProcedure(AdvancedModModElements instance) {
		super(instance, 38);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AdvancedModMod.LOGGER.warn("Failed to load dependency entity for procedure EnderiumOreEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.CACTUS, (float) 3);
	}
}
