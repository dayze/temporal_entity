package com.company.controller;

import com.company.MyWindowListener;
import com.company.model.ModelListener;
import com.company.model.World;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class TemporalController extends JFrame implements ModelListener, ChangeListener {

    private final int SLIDER_MIN = 0;
    private final int SLIDER_MAX = 2000;

    private World world;
    private JSlider slider;

    public TemporalController(World world) {
        super("Le java c'est trop génial !");
        this.world = world;
        this.world.addListener(this);

        slider = new JSlider(JSlider.HORIZONTAL, SLIDER_MIN, SLIDER_MAX, 0);
        slider.addChangeListener(this);

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new MyWindowListener(this));

        this.setLayout(new BorderLayout());
        add(slider, BorderLayout.NORTH);

        this.pack();
        this.setSize(new Dimension(1000, 500));
        this.setVisible(true);
    }

    @Override
    public void updateModel(Object o) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (slider == (JSlider) e.getSource()) {
            world.setCurrentTime((((slider.getValue() - SLIDER_MIN) * (world.getEndTime() - world.getStartTime())) / (SLIDER_MAX - SLIDER_MIN)) + world.getStartTime());
        }
    }
}
