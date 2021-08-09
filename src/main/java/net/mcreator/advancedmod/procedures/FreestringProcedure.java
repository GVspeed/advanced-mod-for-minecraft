package net.mcreator.advancedmod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.advancedmod.AdvancedModModElements;
import net.mcreator.advancedmod.AdvancedModMod;

import java.util.Map;

@AdvancedModModElements.ModElement.Tag
public class FreestringProcedure extends AdvancedModModElements.ModElement {
	public FreestringProcedure(AdvancedModModElements instance) {
		super(instance, 54);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AdvancedModMod.LOGGER.warn("Failed to load dependency entity for procedure Freestring!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Items.STRING, (int) (1));
			_setstack.setCount((int) 8);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
