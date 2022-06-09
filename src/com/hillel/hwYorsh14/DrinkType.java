package com.hillel.hwYorsh14;

public enum DrinkType {
    COFFEE(1),
    TEA(2),
    COLA(3);


    int value;

    DrinkType(int value) {
        this.value = value;
    }

    public static DrinkType convert(int drink){
        for (DrinkType drinkType : values()) {
            if (drinkType.value == drink) {
                return drinkType;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return value + "-" + name();
    }
}
