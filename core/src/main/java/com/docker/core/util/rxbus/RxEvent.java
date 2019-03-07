package com.docker.core.util.rxbus;

public class RxEvent <T, R> {
    private T t;
    private R r;

    public RxEvent() {
    }

    public RxEvent(T t, R r) {
        this.t = t;
        this.r = r;
    }

    public T getT() {
        return this.t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return this.r;
    }

    public void setR(R r) {
        this.r = r;
    }
}
