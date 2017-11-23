package com.company.model;

import com.company.Action;

import java.util.ArrayList;

public class AbstractTemporalEntityWithActions extends AbstractTemporalEntity {

    private ArrayList<Action> actions;
    private String actionsPerformed;

    public AbstractTemporalEntityWithActions(long startTime, long endTime, ArrayList<Action> actions) {
        super(startTime, endTime);
        this.actions = actions;
        actionsPerformed = "";
    }

    public void doSomething() {
        actionsPerformed = "";
        for (Action action : actions) {
            if (action.getStartTime() <= currentTime && currentTime <= action.getEndTime()) {
                actionsPerformed += action + " ";
            }
        }
        fireChanges();
    }

    public String getActionsPerformed() {
        return actionsPerformed;
    }
}
