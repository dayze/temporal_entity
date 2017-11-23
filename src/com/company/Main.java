package com.company;

import com.company.controller.TemporalController;
import com.company.model.World;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        long timestamp = new Date().getTime();

        ArrayList<Action> actions = new ArrayList<>();
        actions.add(new Action(timestamp - 100, timestamp,"Brouter"));

        //Pokemon chenipan = new Pokemon("Pote", timestamp - 10000, timestamp, actions);
        Pokemon chenipan = new Pokemon("Pote", 100, 200, actions);

        World world = new World();
        world.addEntity(chenipan);

        System.out.println(timestamp);
        System.out.println(world.getStartTime());
        System.out.println(world.getEndTime());

        TemporalController temporalController = new TemporalController(world);
    }
}
