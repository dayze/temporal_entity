package com.company;

public interface ListenableModel {

    void addListener(ModelListener l);

    void removeListener(ModelListener l);
}
