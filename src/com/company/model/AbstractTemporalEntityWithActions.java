package com.company.model;

import com.company.Action;
import com.company.model.AbstractTemporalEntity;

import java.util.ArrayList;

public class AbstractTemporalEntityWithActions extends AbstractTemporalEntity {

    private ArrayList<Action> actions;

    public AbstractTemporalEntityWithActions(long startTime, long endTime, ArrayList<Action> actions) {
        super(startTime, endTime);
        this.actions = actions;
    }
}
