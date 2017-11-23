package com.company.model;

import java.util.ArrayList;

public class World extends AbstractListenableModel {
    private long startTime;
    private long endTime;
    private long currentTime;
    private ArrayList<TemporalEntity> entities;

    public World() {
        startTime = 0;
        endTime = 0;
        entities = new ArrayList<TemporalEntity>();
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

    public void addEntity(TemporalEntity temporalEntity) {
        boolean change = false;
        if (temporalEntity.getStartTime() < startTime) {
            startTime = temporalEntity.getStartTime();
            change = true;
        }
        if (temporalEntity.getEndtime() > endTime) {
            endTime = temporalEntity.getEndtime();
            change = true;
        }
        entities.add(temporalEntity);
        if (change) {
            fireChanges();
        }
    }

    public void removeEntity(TemporalEntity temporalEntity) {
        entities.remove(temporalEntity);
    }
}
