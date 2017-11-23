package com.company.model;

public class AbstractTemporalEntity extends AbstractListenableModel implements TemporalEntity {

    private long startTime;
    private long endTime;
    protected long currentTime;

    public AbstractTemporalEntity (long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public void addListener(ModelListener l) {

    }

    @Override
    public void removeListener(ModelListener l) {

    }

    @Override
    public long getStartTime() {
        return this.startTime;
    }

    @Override
    public long getEndtime() {
        return this.endTime;
    }

    @Override
    public void setCurrentTime(long l) {
        this.currentTime = l;
    }
}
