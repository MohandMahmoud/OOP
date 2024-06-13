import java.math.*;
public class Point {
    public int x;
    public int y;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
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



    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static void calc_line(Point p1,Point p2)
    {
        int z =((p1.x-p2.x)^2 + (p1.y-p2.y)^2)^(1/2);
        System.out.println(z);

    }


}
