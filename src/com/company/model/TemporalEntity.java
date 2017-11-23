package com.company.model;

public interface TemporalEntity extends ListenableModel { //todo implements listenableModel
    long getStartTime();
    long getEndtime();
    void setCurrentTime(long l);

}
