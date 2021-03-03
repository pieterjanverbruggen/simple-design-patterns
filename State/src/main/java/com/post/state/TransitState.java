package com.post.state;

import com.post.Package;

public class TransitState implements PackageState {

    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new OrderedState());
    }

    @Override
    public String toString() {
        return "Transit State";
    }

}
