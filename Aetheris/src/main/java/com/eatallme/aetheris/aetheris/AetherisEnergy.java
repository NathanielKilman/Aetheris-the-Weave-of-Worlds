package com.eatallme.aetheris.aetheris;

import java.util.HashMap;
import java.util.UUID;

public class AetherisEnergy {
    private static final HashMap<UUID, Integer> energyStore = new HashMap<>();
    private static final int MAX_ENERGY = 10000;

    public static int get(UUID player) {
        return energyStore.getOrDefault(player, 0);
    }

    public static void add(UUID player, int amount) {
        int current = get(player);
        energyStore.put(player, Math.min(MAX_ENERGY, current + amount));
    }

    public static boolean consume(UUID player, int amount) {
        int current = get(player);
        if (current >= amount) {
            energyStore.put(player, current - amount);
            return true;
        }
        return false;
    }

    public static int getMax() {
        return MAX_ENERGY;
    }
}
