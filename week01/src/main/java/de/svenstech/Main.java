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
        background(235, 171,12);
    }

    public void draw() {
        // ellipse(mouseX, mouseY, 50, 50);
        if (mousePressed) {
            fill(255);
            ellipse(width / 2, height / 2, 400, 400);
            fill(0);
            ellipse(width/2, height/2, 10, 10);

        }else if(keyPressed){
            fill(125);
            ellipse(width / 2, height / 2, 400, 400);
            fill(0);
            ellipse(width/2, height/2, 10, 10);
            
        }
    }
}