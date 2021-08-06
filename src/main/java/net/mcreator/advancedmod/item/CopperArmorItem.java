
package net.mcreator.advancedmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.advancedmod.procedures.CopperArmorLeggingsTickEventProcedure;
import net.mcreator.advancedmod.procedures.CopperArmorHelmetTickEventProcedure;
import net.mcreator.advancedmod.procedures.CopperArmorBootsTickEventProcedure;
import net.mcreator.advancedmod.procedures.CopperArmorBodyTickEventProcedure;
import net.mcreator.advancedmod.itemgroup.AddonsItemGroup;
import net.mcreator.advancedmod.AdvancedModModElements;

import java.util.Map;
import java.util.HashMap;

@AdvancedModModElements.ModElement.Tag
public class CopperArmorItem extends AdvancedModModElements.ModElement {
	@ObjectHolder("advanced_mod:copper_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("advanced_mod:copper_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("advanced_mod:copper_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("advanced_mod:copper_armor_boots")
	public static final Item boots = null;
	public CopperArmorItem(AdvancedModModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.break"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CopperIngotItem.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "copper_armor";
			}

			@Override
			public float getToughness() {
				return 0.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(AddonsItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "advanced_mod:textures/models/armor/1_14_bronze_armor_layer_1_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onArmorTick(itemstack, world, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					CopperArmorHelmetTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("copper_armor_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(AddonsItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "advanced_mod:textures/models/armor/1_14_bronze_armor_layer_1_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					CopperArmorBodyTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("copper_armor_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(AddonsItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "advanced_mod:textures/models/armor/1_14_bronze_armor_layer_1_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					CopperArmorLeggingsTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("copper_armor_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(AddonsItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "advanced_mod:textures/models/armor/1_14_bronze_armor_layer_1_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					CopperArmorBootsTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("copper_armor_boots"));
	}
}
