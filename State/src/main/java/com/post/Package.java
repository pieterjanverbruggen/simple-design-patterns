package com.post;

import com.post.state.OrderedState;
import com.post.state.PackageState;

public class Package {

    private PackageState state;

    public void setState(PackageState state) {
        this.state = state;
    }

    public Package(){
        state = new OrderedState();
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        System.out.println("Current state is " + state.toString());
    }
}