 package interfaceforellipse;
 public class InterfaceForEllipse {
 
    public static void main(String[] args) {
    Shape shape = new Square(10);
    System.out.println(shape.toString());
       Eccentric ellipse = new Ellipse(10, 7);
    System.out.println(ellipse.toString());
       }
 }
