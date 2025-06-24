package com.eatallme.aetheris;

import com.eatallme.aetheris.registry.ModItems;
import com.eatallme.aetheris.network.NetworkHandler;
import com.eatallme.aetheris.integration.WizardryCompat;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("aetheris")
public class Aetheris {
    public static final String MODID = "aetheris";

    public Aetheris() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        NetworkHandler.register();
        WizardryCompat.register();
    }
}
