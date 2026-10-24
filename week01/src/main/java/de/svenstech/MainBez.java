package de.svenstech;

import processing.core.PApplet;

public class MainBez extends PApplet{

    int width = 400;
    int height = 400;
    int umbrella_width = 300;
    

    public static void main(String[] args) {
        PApplet.main(MainBez.class);
    }

    public void settings(){
        size(width , height);
    } 

    public void setup(){
        background(255);
    }

    // get's called at 60fps
    public void draw(){
        
    }
    
}
