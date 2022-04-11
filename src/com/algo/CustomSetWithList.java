package com.algo;

import java.util.ArrayList;
import java.util.List;

public class CustomSetWithList {
    private final List<Integer> container;

    public CustomSetWithList() {
        this.container = new ArrayList<>();
    }

    public void add(int val) {
        if (!exists(val))
            container.add(val);
    }

    public boolean exists(int val) {
        return container.contains(val);
    }

    public void remove(int val) {
        container.remove((Integer) val);
    }

    public List<Integer> getContainer() {
        return container;
    }
}
