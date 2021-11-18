package com.company;

public abstract class Block {
    private int resistance;

    public Block(int resistance) {
        this.resistance = resistance;
    }

    public abstract void damageSound();

    public int getResistance() {
        return resistance;
    }
}


