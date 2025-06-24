package com.eatallme.aetheris.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class CoreItem extends Item {
    public CoreItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean onDroppedByPlayer(ItemStack item, PlayerEntity player) {
        return false; // Prevent dropping
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, PlayerEntity player, int slot, boolean selected) {
        if (!player.inventory.contains(stack)) {
            player.inventory.add(stack);
        }
    }
}
