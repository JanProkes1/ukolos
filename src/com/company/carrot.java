package com.company;

public class carrot extends Block implements GrowUp {
    public carrot() {
        super(2);
    }

    @Override
    public void damageSound() {
        System.out.println("Zvuk zníčení mrkve");

    }

    @Override
    public void onGrouwup() {
        System.out.println("Mrkev vyrostla");
    }
}
