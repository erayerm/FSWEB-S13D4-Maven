package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        return distance(0,0);
    }
    public double distance(Point p){
        return distance(p.getX(), p.getY());
    }
    public double distance(int a, int b){
        return Math.sqrt(Math.pow(a-this.x, 2) + Math.pow(b-this.y, 2));
    }

}
