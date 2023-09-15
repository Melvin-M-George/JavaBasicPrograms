class Employee {
    int salary;
    String name;


    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling...");
    }

}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return side*4;
    }
}

class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting");
    }
    public void run(){
        System.out.println("running");
    }
    public void fire(){
        System.out.println("Firing");
    }

}
public class CWH_39_Ch8_PS {
    public static void main(String[] args) {
        /*
        //Question-1
        Employee harry = new Employee();
        harry.salary = 15;
        harry.setName("CodeWithHarry");
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

        //Question-2
        CellPhone samsung = new CellPhone();
        samsung.ring();
        samsung.vibrate();
        samsung.callFriend();

        */
        //Question-3
        /*
        Square sq = new Square();
        sq.side = 10;
        System.out.println("The area of the square is:"+sq.area());
        System.out.println("The perimeter of the square is:"+sq.perimeter());
        */
        //Question-4
        /*
        Rectangle rec = new Rectangle();
        rec.length = 4;
        rec.breadth = 2;
        System.out.println("The area of the rectangle is:"+rec.area());
        System.out.println("The perimeter of the rectangle is:"+rec.perimeter());

         */
        //Question-5
        Tommy player = new Tommy();
        player.hit();
        player.run();
        player.fire();





    }
}
