package net.mcreator.advancedmod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.advancedmod.AdvancedModModElements;
import net.mcreator.advancedmod.AdvancedModMod;

import java.util.Map;

@AdvancedModModElements.ModElement.Tag
public class FreeSandProcedure extends AdvancedModModElements.ModElement {
	public FreeSandProcedure(AdvancedModModElements instance) {
		super(instance, 51);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AdvancedModMod.LOGGER.warn("Failed to load dependency entity for procedure FreeSand!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Blocks.SAND, (int) (1));
			_setstack.setCount((int) 8);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
