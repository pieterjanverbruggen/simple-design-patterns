package com.farm.strategy;

public class Sweet implements Mood {

    @Override
    public String changeMood(String sound) {
        return sound.toLowerCase();
    }
}
