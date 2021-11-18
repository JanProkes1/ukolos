package com.company;

public class Door extends Block implements RightClick {
    private boolean isOpen;
    public Door() {
        super(10);
        this.isOpen = false;
    }

    @Override
    public void onRightClick() {

        if (isOpen){
            System.out.println("Dveře se zavřeli");
            isOpen = false;
        } else {
            isOpen = true;
            System.out.println("Dveře se otevřeli");
        }
    }

    @Override
    public void damageSound() {
        System.out.println("Zvuk zníčení dveří");
    }

    public boolean isOpen() {
        return isOpen;
    }
}
