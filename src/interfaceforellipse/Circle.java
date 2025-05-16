 package interfaceforellipse;
 public class Circle extends Ellipse {
    private double radius;
    public Circle(double radius){
    super(radius, radius);
    }
      @Override
	public double area(){
		return Math.PI * (radius * radius);
	}
    @Override
	public double perimeter(){
		return 2.0 * Math.PI * radius;
	}
            @Override
	public double eccentricity(){
		 return 0;
	}
            @Override
	public String toString(){
            return super.toString();
        }
 }