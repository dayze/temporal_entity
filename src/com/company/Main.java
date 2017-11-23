package com.company;

import com.company.controller.TemporalController;
import com.company.model.World;

public class Main {

    public static void main(String[] args) {
        World world = new World();
        TemporalController temporalController = new TemporalController(world);
    }
}
