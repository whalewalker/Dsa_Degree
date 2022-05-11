package com.algo;

import java.util.LinkedList;
import java.util.Queue;

public class HitCounter {

    private final Queue<Integer> timestamps;

    public HitCounter() {
        timestamps = new LinkedList<>();
    }

    public void add(int timestamp) {
        timestamps.add(timestamp);
    }

    public int count(int timestamp) {

        for (int ignored : timestamps) {
            if (!timestamps.isEmpty() && timestamps.peek() < timestamp - 60) {
                timestamps.poll();
            }
        }
        return timestamps.size();
    }


}
