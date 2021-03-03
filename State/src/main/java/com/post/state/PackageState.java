package com.post.state;

import com.post.Package;

public interface PackageState {

        void next(Package pkg);
        void prev(Package pkg);
        String toString();

}
