package com.company;

import com.company.model.AbstractTemporalEntityWithActions;

import java.util.ArrayList;

public class Pokemon extends AbstractTemporalEntityWithActions {

    private String name;

    public Pokemon(String name, long startTime, long endTime) {
        this(name, startTime, endTime, new ArrayList<>());
    }

    public Pokemon(String name, long startTime, long endTime, ArrayList<Action> actions) {
        super(startTime, endTime, actions);
        this.name = name;
    }
}
