class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public double surfaceArea(){
        return  2* Math.PI * radius*height + 2*Math.PI*radius*radius;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}


class Rectangle1{
    private int length;
    public int breadth;

    public Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
public class CWH_44_Practice_Set_9 {
    public static void main(String[] args) {


        Cylinder myCylinder = new Cylinder(9,12);

        /*
        //myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        //myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());




        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

         */


        Rectangle1 r = new Rectangle1();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

    }
}
