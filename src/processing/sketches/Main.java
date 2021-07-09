package processing.sketches;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main extends PApplet {
    static PApplet applet;
    List<Circle> myCircles;

    //Runs right when the program begins
    public void settings() {
        applet = this;
        size(600, 600);
    }

    public void setup() {
        surface.setLocation(2855, 0);

        myCircles = new ArrayList<Circle>();

        for (int i = 0; i < 5; i++) {
            myCircles.add(new Circle(width/2.0f + (i - 2) * 60, i * PI/5.0f, color(255, 100, 80)));
            myCircles.add(new Circle(width/2.0f + (i - 2) * 60, i * PI/5.0f + PI, color(255, 230, 200)));
        }
    }

    //Updates once per frame
    public void draw() {
        background(0, 0, 0);

        Collections.sort(myCircles);
        for (Circle c : myCircles) {
            c.move();
            c.drawSelf();
        }
    }

    public static void main(String... args){
        PApplet.main("processing.sketches.Main");
    }
}
