package processing.sketches;

import processing.core.PApplet;

public class Circle implements Comparable<Circle> {
    //Bring in processing functions
    private static final PApplet p = Main.applet;

    //Properties
    //Class fields
    private float x;
    private float y;
    private float radius;
    private float angle;
    private float amplitude = 60;
    private int clr;

    //Constructor
    public Circle(float _x, float _angle, int _clr) {
        this.x = _x;
        this.angle = _angle;
        this.clr = _clr;

        this.radius = 40;
        this.y = p.height/2.0f;
    }

    //Methods (Actions)
    public void drawSelf() {
        p.fill(clr);
        p.ellipse(x, y, radius, radius);
    }

    public void move() {
        angle -= p.PI/60.0f;
        y = p.height/2.0f + (amplitude * p.sin(angle));
        radius = 40 + 20 * p.sin(angle + p.PI/2);
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public int compareTo(Circle other) {
        if (radius - other.getRadius() > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}

