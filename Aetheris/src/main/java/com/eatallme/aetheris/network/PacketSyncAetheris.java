package com.eatallme.aetheris.network;

import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;
import java.util.UUID;

public class PacketSyncAetheris {
    private final UUID playerId;
    private final int energy;

    public PacketSyncAetheris(UUID playerId, int energy) {
        this.playerId = playerId;
        this.energy = energy;
    }

    public static void encode(PacketSyncAetheris msg, PacketBuffer buf) {
        buf.writeUUID(msg.playerId);
        buf.writeInt(msg.energy);
    }

    public static PacketSyncAetheris decode(PacketBuffer buf) {
        return new PacketSyncAetheris(buf.readUUID(), buf.readInt());
    }

    public static void handle(PacketSyncAetheris msg, Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            // TODO: Add client-side energy syncing display logic here
        });
        ctx.get().setPacketHandled(true);
    }
}
