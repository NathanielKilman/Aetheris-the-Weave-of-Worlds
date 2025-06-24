package com.eatallme.aetheris.client;

import com.eatallme.aetheris.capability.AetherisProvider;
import com.eatallme.aetheris.capability.IAetheris;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "aetheris", value = Dist.CLIENT)
public class AetherisHUD {

    @SubscribeEvent
    public static void onRenderOverlay(RenderGameOverlayEvent.Text event) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            mc.player.getCapability(AetherisProvider.AETHERIS_CAPABILITY).ifPresent(cap -> {
                int energy = cap.getEnergy();
                MatrixStack matrixStack = event.getMatrixStack();
                mc.font.draw(matrixStack, new StringTextComponent("Aetheris: " + energy), 10, 10, 0x55FFFF);
            });
        }
    }
}
