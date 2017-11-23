package com.company.model;

public interface InterfaceTemporalEntity extends ListenableModel { //todo implements listenableModel
    long getStartTime();
    long getEndtime();
    void setCurrentTime(long l);

}
