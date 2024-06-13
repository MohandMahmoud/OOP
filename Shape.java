public abstract class Shape {
    public double x;
    public double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double setXY(double x,double y) {
        double z=x*y;
      return z;
    }
    public abstract void area();


}
class triangle extends Shape{
    public triangle(double x, double y) {
        super(x, y);
    }

    @Override
    public void area() {
        System.out.println(0.5*setXY(x,y));
    }

}
class circle extends Shape{
    public circle(double x, double y) {
        super(x, y);
    }

    @Override
    public void area() {
        System.out.println(setXY(x,y));
    }
}
