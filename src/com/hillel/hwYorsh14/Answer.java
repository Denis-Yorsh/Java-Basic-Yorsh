package com.hillel.hwYorsh14;

public enum Answer {
    YES(1),
    NO(2);

    int value;

    Answer(int value) {
        this.value = value;
    }

    public static Answer convert(int value){
        for (Answer answer : values()) {
            if (answer.value == value) {
                return answer;
            }
        }
        return NO;
    }
}
