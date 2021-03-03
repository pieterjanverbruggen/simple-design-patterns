package com.farmshop.strategy;

public class Confused implements Mood {

    @Override
    public String changeMood(String sound) {
        return "Tsjirp-Tsjirp?";
    }

}
