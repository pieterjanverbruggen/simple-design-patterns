package com.post.state;

import com.post.Package;

public class OrderedState implements PackageState {

    @Override
    public void next(Package pkg) {
        pkg.setState(new TransitState());
    }

    @Override
    public void prev(Package pkg) {
        System.out.println("No previous state");
    }

    @Override
    public String toString() {
        return "Ordered State";
    }
}
