package com.codecool.uml.overriding;

public abstract class AbstractProcess {
    public void process(Orderable item) {
        // TODO
    }

    public void stepBefore() {
        // TODO
    }

    protected abstract void action(Orderable item);

    public void stepAfter() {
        // TODO
    }
}
