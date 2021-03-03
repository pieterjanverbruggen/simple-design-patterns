package com.post.state;

import com.post.Package;

public class DeliveredState implements PackageState {

    @Override
    public void next(Package pkg) {
        System.out.println("No next state.");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new TransitState());
    }

    @Override
    public String toString() {
        return "Delivered State";
    }
}

