package com.hillel.hwYorsh13.PhoneIosAndroids;

public class Iphones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("iPhones call");
    }

    @Override
    public void sms() {
        System.out.println("iPhones sms");
    }

    @Override
    public void internet() {
        System.out.println("iPhones internet");
    }

    @Override
    public void faceId() {
        System.out.println("iPhones faceId");
    }
}
