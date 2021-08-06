package net.mcreator.advancedmod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.advancedmod.AdvancedModModElements;
import net.mcreator.advancedmod.AdvancedModMod;

import java.util.Map;

@AdvancedModModElements.ModElement.Tag
public class CopperArmorBootsTickEventProcedure extends AdvancedModModElements.ModElement {
	public CopperArmorBootsTickEventProcedure(AdvancedModModElements instance) {
		super(instance, 34);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AdvancedModMod.LOGGER.warn("Failed to load dependency entity for procedure CopperArmorBootsTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, (int) 99999999, (int) 5));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 99999999, (int) 3));
	}
}
