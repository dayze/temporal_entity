package com.company.controller;

import com.company.MyWindowListener;
import com.company.model.ModelListener;
import com.company.model.World;

import javax.swing.*;
import java.awt.*;

public class TemporalController extends JFrame implements ModelListener {

    private World world;
    private JSlider slider;

    public TemporalController(World world) {
        super("Le java c'est trop génial !");
        this.world = world;
        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new MyWindowListener(this));

        this.setLayout(new BorderLayout());
        add(slider, BorderLayout.NORTH);

        this.pack();
        this.setSize(new Dimension(1400, 700));
        this.setVisible(true);
    }

    @Override
    public void updateModel(Object o) {

    }
}
