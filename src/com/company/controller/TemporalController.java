package com.company.controller;

import com.company.MyWindowListener;
import com.company.model.World;

import javax.swing.*;
import java.awt.*;

public class TemporalController extends JFrame {
    private World world;
    public TemporalController(World world) {
        super("Le java c'est trop génial !");
        this.world = world;

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new MyWindowListener(this));
        this.setLayout(new BorderLayout());
        this.pack();
        this.setSize(new Dimension(1400, 700));
        this.setVisible(true);
    }


}
