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
}
public class CWH_44_Practice_Set_9 {
    public static void main(String[] args) {

        //Question -1
        Cylinder myCylinder = new Cylinder();
        myCylinder.setRadius(5);
        System.out.println(myCylinder.getRadius());
        myCylinder.setHeight(10);
        System.out.println(myCylinder.getHeight());


    }
}
