package com.eatallme.aetheris.capability;

public interface IAetheris {
    int getEnergy();
    void setEnergy(int energy);
    void addEnergy(int amount);
    boolean consumeEnergy(int amount);
}
