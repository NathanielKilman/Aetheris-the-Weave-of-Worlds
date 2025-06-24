package com.eatallme.aetheris.integration;

import net.minecraftforge.fml.ModList;

public class WizardryCompat {
    public static void register() {
        if (ModList.get().isLoaded("ebwizardry")) {
            System.out.println("[Aetheris] Electroblob's Wizardry detected — enabling compatibility hooks.");
            // TODO: Future spell translation via shared Aetheris costs
        }
    }
}
