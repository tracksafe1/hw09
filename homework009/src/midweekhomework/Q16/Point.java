package midweekhomework.Q16;

public class Point {
    int x;
    int y;
   public Point (){

    }
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    public double distance(){
       return Math.sqrt((x*x)+(y*y));

    }
    public double distance(int Ax,int Ay){
       return Math.sqrt((x-Ax)*(x-Ax)+(y-Ay)*(y-Ay));}
       public double distance(Point pt){
           return Math.sqrt((x-pt.x)*(x-pt.x)+(y-pt.y)*(y-pt.y));
        }



    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
