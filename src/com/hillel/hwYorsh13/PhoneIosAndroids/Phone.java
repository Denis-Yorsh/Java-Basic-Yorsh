package com.hillel.hwYorsh13.PhoneIosAndroids;

public class Phone {

    public static void main(String[] args) {

        Smartphones callMe = new Iphones();
        Smartphones smsMe = new Iphones();
        Smartphones internetMe = new Iphones();
        Smartphones isCallMe = new Androids();
        Smartphones isSmsMe = new Androids();
        Smartphones isInternetMe = new Androids();

        IOS phoneIos = new Iphones();
        phoneIos.faceId();

        LinuxOS phoneAndroids = new Androids();
        phoneAndroids.touchID();

        Smartphones[] array = {callMe, smsMe, internetMe,
                isCallMe, isSmsMe, isInternetMe,
                (Smartphones) phoneIos, (Smartphones) phoneAndroids};
    }
}
