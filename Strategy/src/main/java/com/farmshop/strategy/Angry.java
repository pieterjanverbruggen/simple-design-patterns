package com.farmshop.strategy;

public class Angry implements Mood {

    @Override
    public String changeMood(String sound) {
        return sound.toUpperCase();
    }

}
