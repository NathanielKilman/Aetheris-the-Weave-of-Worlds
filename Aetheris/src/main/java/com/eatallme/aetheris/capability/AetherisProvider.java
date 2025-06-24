package com.eatallme.aetheris.capability;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;

public class AetherisProvider implements ICapabilityProvider {
    @CapabilityInject(IAetheris.class)
    public static Capability<IAetheris> AETHERIS_CAPABILITY = null;

    private final IAetheris instance = new AetherisStorage();
    private final LazyOptional<IAetheris> optional = LazyOptional.of(() -> instance);

    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
        return cap == AETHERIS_CAPABILITY ? optional.cast() : LazyOptional.empty();
    }

    public CompoundNBT serializeNBT() {
        return (CompoundNBT) AETHERIS_CAPABILITY.getStorage().writeNBT(AETHERIS_CAPABILITY, instance, null);
    }

    public void deserializeNBT(CompoundNBT nbt) {
        AETHERIS_CAPABILITY.getStorage().readNBT(AETHERIS_CAPABILITY, instance, null, nbt);
    }
}
