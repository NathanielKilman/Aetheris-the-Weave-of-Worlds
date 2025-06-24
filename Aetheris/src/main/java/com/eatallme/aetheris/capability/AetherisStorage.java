package com.eatallme.aetheris.capability;

import net.minecraft.nbt.CompoundNBT;

public class AetherisStorage implements IAetheris {
    private int energy = 0;
    private final int maxEnergy = 10000;

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public void setEnergy(int energy) {
        this.energy = Math.min(energy, maxEnergy);
    }

    @Override
    public void addEnergy(int amount) {
        setEnergy(this.energy + amount);
    }

    @Override
    public boolean consumeEnergy(int amount) {
        if (this.energy >= amount) {
            this.energy -= amount;
            return true;
        }
        return false;
    }

    public CompoundNBT writeNBT() {
        CompoundNBT tag = new CompoundNBT();
        tag.putInt("Energy", energy);
        return tag;
    }

    public void readNBT(CompoundNBT tag) {
        this.energy = tag.getInt("Energy");
    }
}
