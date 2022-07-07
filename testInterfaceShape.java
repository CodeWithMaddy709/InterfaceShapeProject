public class testInterfaceShape {
    public static void main(String[] args) {

        RectangleShape rectangle, rectRef;
        BoxShape box, boxRef;
        Shape refShape;
        rectangle = new RectangleShape(12, 4);
        System.out.println("Line 4: Rectangle \n" + rectangle);
        refShape = rectangle;
        System.out.println("\nPolymorphism: Invoking Subclass method with superclass object reference : =  "
                + refShape.area() + "\n");
        AngleShape angleShapeRef;
        angleShapeRef = rectangle;
        System.out.println("Calling method defined in interface AngleShape : ");
        angleShapeRef.printShapeInfo();
        System.out.println("Line 6: Rectangle \n" + rectangle);

        System.out.println("\nCalling method defined in interface AngleShape :");
        angleShapeRef.printShapeInfo();
        boxRef = new BoxShape(10, 2, 3);
        System.out.println("Line 6: boxRef \n" + boxRef + "\n");
        angleShapeRef = boxRef;
        System.out.println("Calling method defined in interface AngleShape :");
        angleShapeRef.printShapeInfo();

    }

}
