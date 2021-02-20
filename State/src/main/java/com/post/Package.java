package com.post;

public class Package {

    enum PackageState {
        Ordered, Transit, Delivered
    }

    private PackageState state;

    public Package(){
        state = PackageState.Ordered;
    }

    // TODO Implement the State Pattern to clean up this code

    public void previousState() {
        if (state == PackageState.Ordered) {
            System.out.println("No previous state");
        }
        else if (state == PackageState.Transit) {
            state = PackageState.Ordered;
            System.out.println("Package set to Ordered state");
        } else if (state == PackageState.Delivered) {
            state = PackageState.Transit;
            System.out.println("Package set to Transit state");
        } else {
            System.out.println("You're package went missing");
        }
    }

    public void nextState() {
        if (state == PackageState.Ordered) {
            state = PackageState.Transit;
            System.out.println("Package set to Transit state");
        }
        else if (state == PackageState.Transit) {
            state = PackageState.Delivered;
            System.out.println("Package set to Delivered state");
        } else if (state == PackageState.Delivered) {
            System.out.println("No next state");
        } else {
            System.out.println("You're package went missing");
        }
    }

    public void printStatus() {
        System.out.println("Current state is " + state.toString());
    }
}