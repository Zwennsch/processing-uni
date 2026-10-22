package de.svenstech;

import processing.core.PApplet;

public class Main extends PApplet {
    int width = 400;
    int height = 400;

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }

    public void settings() {
        size(400, 400);
        // fullScreen();
    }

    public void setup() {
        background(235, 171, 12);
    }

    public void draw() {
        // ellipse(mouseX, mouseY, 50, 50);
        if (mousePressed) {
            fill(255);
            strokeWeight(1);
            ellipse(width / 2, height / 2, 400, 400);
            fill(0);
            ellipse(width / 2, height / 2, 10, 10);
            strokeWeight(3);
            line(width / 2, height / 2, width / 2, 20);
            strokeWeight(8);
            line(width / 2, height / 2, 60, height / 2);
            
        } else if (keyPressed) {
            fill(255);
            strokeWeight(1);
            ellipse(width / 2, height / 2, 400, 400);
            fill(0);
            ellipse(width / 2, height / 2, 10, 10);
            strokeWeight(3);
            line(width / 2, height / 2, width / 2, 20);
            strokeWeight(8);
            line(width / 2, height / 2, width / 2 + 121, height/2 + 70);
        }
    }
}