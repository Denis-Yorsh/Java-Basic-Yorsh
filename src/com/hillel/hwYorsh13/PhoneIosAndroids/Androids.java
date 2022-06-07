package com.hillel.hwYorsh13.PhoneIosAndroids;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void touchID() {
        System.out.println("Androids touchID");
    }

    @Override
    public void call() {
        System.out.println("Androids call");
    }

    @Override
    public void sms() {
        System.out.println("Androids sms");
    }

    @Override
    public void internet() {
        System.out.println("Androids internet");
    }
}
