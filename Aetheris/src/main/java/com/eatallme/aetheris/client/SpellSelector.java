package com.eatallme.aetheris.client;

import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.client.Minecraft;

@Mod.EventBusSubscriber(modid = "aetheris")
public class SpellSelector {

    @SubscribeEvent
    public static void onKeyInput(InputEvent.KeyInputEvent event) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null && event.getKey() == mc.options.keyInventory.getKey().getValue()) {
            // Placeholder: Hook to spellcasting UI
        }
    }
}
