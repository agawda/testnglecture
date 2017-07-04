package com.gawdski.testnglecture;

public class FaultyClass {
    public void throwSth() {
        throw new IllegalStateException();
    }

    void dontThrow() {

    }
}
