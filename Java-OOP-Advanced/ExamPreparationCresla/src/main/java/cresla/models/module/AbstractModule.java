package cresla.models.module;

import cresla.interfaces.Module;

public abstract class AbstractModule implements Module {

    private int id;

    public AbstractModule(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " Module – " + this.id +
                "{additionalParam}: {additionalParamValue}\n";
    }
}
