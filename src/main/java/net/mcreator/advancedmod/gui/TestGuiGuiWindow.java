
package net.mcreator.advancedmod.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.advancedmod.AdvancedModMod;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TestGuiGuiWindow extends ContainerScreen<TestGuiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	public TestGuiGuiWindow(TestGuiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}
	private static final ResourceLocation texture = new ResourceLocation("advanced_mod:textures/test_gui.png");
	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Some building blocks", 33, 6, -3407872);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 6, this.guiTop + 44, 45, 20, new StringTextComponent("Dirt"), e -> {
			if (true) {
				AdvancedModMod.PACKET_HANDLER.sendToServer(new TestGuiGui.ButtonPressedMessage(0, x, y, z));
				TestGuiGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 64, this.guiTop + 44, 45, 20, new StringTextComponent("Wool"), e -> {
			if (true) {
				AdvancedModMod.PACKET_HANDLER.sendToServer(new TestGuiGui.ButtonPressedMessage(1, x, y, z));
				TestGuiGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 122, this.guiTop + 44, 45, 20, new StringTextComponent("Sand"), e -> {
			if (true) {
				AdvancedModMod.PACKET_HANDLER.sendToServer(new TestGuiGui.ButtonPressedMessage(2, x, y, z));
				TestGuiGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 4, this.guiTop + 79, 50, 20, new StringTextComponent("Grass"), e -> {
			if (true) {
				AdvancedModMod.PACKET_HANDLER.sendToServer(new TestGuiGui.ButtonPressedMessage(3, x, y, z));
				TestGuiGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 64, this.guiTop + 79, 50, 20, new StringTextComponent("Fence"), e -> {
			if (true) {
				AdvancedModMod.PACKET_HANDLER.sendToServer(new TestGuiGui.ButtonPressedMessage(4, x, y, z));
				TestGuiGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 126, this.guiTop + 79, 40, 20, new StringTextComponent("Ice"), e -> {
			if (true) {
				AdvancedModMod.PACKET_HANDLER.sendToServer(new TestGuiGui.ButtonPressedMessage(5, x, y, z));
				TestGuiGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 4, this.guiTop + 110, 55, 20, new StringTextComponent("String"), e -> {
			if (true) {
				AdvancedModMod.PACKET_HANDLER.sendToServer(new TestGuiGui.ButtonPressedMessage(6, x, y, z));
				TestGuiGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 65, this.guiTop + 110, 55, 20, new StringTextComponent("Carpet"), e -> {
			if (true) {
				AdvancedModMod.PACKET_HANDLER.sendToServer(new TestGuiGui.ButtonPressedMessage(7, x, y, z));
				TestGuiGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 125, this.guiTop + 110, 45, 20, new StringTextComponent("G.E."), e -> {
			if (true) {
				AdvancedModMod.PACKET_HANDLER.sendToServer(new TestGuiGui.ButtonPressedMessage(8, x, y, z));
				TestGuiGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
	}
}
