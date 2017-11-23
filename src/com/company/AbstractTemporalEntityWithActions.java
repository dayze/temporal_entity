package com.company;

import java.util.ArrayList;

public class AbstractTemporalEntityWithActions extends AbstractTemporalEntity {

    private ArrayList<Action> actions;

    public AbstractTemporalEntityWithActions(long startTime, long endTime) {
        this(startTime, endTime, new ArrayList<>());
    }

    public AbstractTemporalEntityWithActions(long startTime, long endTime, ArrayList<Action> actions) {
        super(startTime, endTime);
        this.actions = actions;
    }
}
