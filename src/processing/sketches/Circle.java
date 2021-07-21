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
    private int hue;

    //Constructor
    public Circle(float x, float angle, int hue) {
        this.x = x;
        this.angle = angle;
        this.hue = hue;

        this.radius = 40;
        this.y = p.height/2.0f;
    }

    //Methods (Actions)
    public void drawSelf() {
        p.fill(hue);
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

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public float getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(float amplitude) {
        this.amplitude = amplitude;
    }

    public int getHue() {
        return hue;
    }

    public void setHue(int hue) {
        this.hue = hue;
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

