class circle{
    public int radius;
    circle (int r){
        this.radius = r;
    }
    public double area(){
        return Math.PI * this.radius * this.radius ;
    }
}
class cylinder extends circle{
    public int height;
    cylinder(int r, int h){
        super(r);
        this.height = h;

    }

    public double volume(){
        return Math.PI * this.radius * this.radius * this.height;
    }
}
public class CWH_52_ch10_ps {
    public static void main(String[] args) {
        //Problem-1
        circle objcircle = new circle(6);
        cylinder objcylinder = new cylinder(6,9);

    }
}
