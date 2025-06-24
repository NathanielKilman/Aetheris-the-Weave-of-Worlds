package com.eatallme.aetheris.registry;

import com.eatallme.aetheris.Aetheris;
import com.eatallme.aetheris.items.CoreItem;
import com.eatallme.aetheris.items.FusionCatalystItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Aetheris.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
    public static final Item CORE = new CoreItem(new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_MISC)).setRegistryName("core");
    public static final Item FUSION_CATALYST = new FusionCatalystItem(new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_MISC)).setRegistryName("fusion_catalyst");

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(CORE, FUSION_CATALYST);
    }

    public static void register(IEventBus eventBus) {
        // Placeholder for deferred registry if needed in future
    }
}
