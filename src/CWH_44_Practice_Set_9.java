class Cylinder{
    private int radius;
    private int height;

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
        return  2* Math.PI * radius*height + 2*3.14*radius*radius;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class CWH_44_Practice_Set_9 {
    public static void main(String[] args) {


        Cylinder myCylinder = new Cylinder();
        //Question -1
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());



        //Question-2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());


    }
}
