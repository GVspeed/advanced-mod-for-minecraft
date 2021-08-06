
package net.mcreator.advancedmod.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.advancedmod.itemgroup.AddonsItemGroup;
import net.mcreator.advancedmod.item.RawcopperItem;
import net.mcreator.advancedmod.AdvancedModModElements;

import java.util.List;
import java.util.Collections;

@AdvancedModModElements.ModElement.Tag
public class CopperOreBlock extends AdvancedModModElements.ModElement {
	@ObjectHolder("advanced_mod:copper_ore")
	public static final Block block = null;
	public CopperOreBlock(AdvancedModModElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(AddonsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));
			setRegistryName("copper_ore");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(RawcopperItem.block, (int) (1)));
		}
	}
}
