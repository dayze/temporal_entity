package com.company.model;

import java.util.ArrayList;

public class World extends AbstractListenableModel {

    public final static long UNDEFINED = -1;
    private long startTime, endTime, currentTime;
    private ArrayList<TemporalEntity> entities;

    public World() {
        startTime = endTime = currentTime = UNDEFINED;
        entities = new ArrayList<>();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }

    public boolean synchronizeStartTime(TemporalEntity temporalEntity) {
        if (startTime == UNDEFINED || temporalEntity.getStartTime() < startTime) {
            startTime = temporalEntity.getStartTime();
            return true;
        }
        return false;
    }

    public boolean synchronizeEndTime(TemporalEntity temporalEntity) {
        if (endTime == UNDEFINED || temporalEntity.getEndtime() > endTime) {
            endTime = temporalEntity.getEndtime();
            return true;
        }
        return false;
    }

    public void addEntity(TemporalEntity temporalEntity) {
        boolean change1 = synchronizeStartTime(temporalEntity);
        boolean change2 = synchronizeEndTime(temporalEntity);
        entities.add(temporalEntity);
        if (change1 || change2) {
            fireChanges();
        }
    }

    public void removeEntity(TemporalEntity temporalEntity) {
        boolean change1 = false;
        boolean change2 = false;
        if (temporalEntity.getStartTime() != startTime) {
            for (TemporalEntity entity : entities) {
                change2 = synchronizeStartTime(entity);
            }
        }
        if (temporalEntity.getEndtime() != endTime) {
            for (TemporalEntity entity : entities) {
                change2 = synchronizeEndTime(entity);
            }
        }
        entities.remove(temporalEntity);
        if (change1 || change2) {
            fireChanges();
        }
    }
}
