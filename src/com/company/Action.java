package com.company;

public class Action {

    private long startTime;
    private long endTime;
    private String label;

    public Action(long startTime, long endTime, String label) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.label = label;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String toString() {
        return label;
    }
}
