package com.farm.strategy;

public class Normal implements Mood {

    @Override
    public String changeMood(String sound) {
        return sound;
    }
}
