public class BoxShape extends RectangleShape {
    private double height;

    public BoxShape() {
        super();
        height = 0;
    }

    public BoxShape(double l, double w, double h) {

        super(l, w);
        height = h;
    }

    public void setDimension(double l, double w, double h) {
        super.setDimension(l, w);
        if (height >= 0)
            height = h;
        else
            height = 0;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return 2 * (getLength() * getWidth() + getLength() * height + getWidth() * height);
    }

    public double volume() {
        return super.area() * height;
    }

    public String toString() {
        return "Length = " + getLength() + ", Width = " + getWidth() + "; Height  = " + height + ", Surface Area = "
                + area() + ", Volume  = "
                + volume();
    }

    public void printShapeInfo() {
        System.out.println("Length = " + getLength() + ", Width = " + getWidth() + ", angle shape = " + angle / 2);
    }

}
