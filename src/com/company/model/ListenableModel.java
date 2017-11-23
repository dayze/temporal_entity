package com.company.model;

public interface ListenableModel {

    void addListener(ModelListener l);

    void removeListener(ModelListener l);
}
