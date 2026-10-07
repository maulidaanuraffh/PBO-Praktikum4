public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        System.out.println("Cylinder(double,double) dipanggil"); 
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public double cobaAksesRadius() { 
        return getRadius();   
    } 

    @Override 
    public double getArea() { 
        return 2 * Math.PI * getRadius() * height 
            + 2 * Math.PI * getRadius() * getRadius(); 
    } 

    @Override 
    public String toString() { 
        return "Cylinder: subclass of " + super.toString() 
            + ", height=" + height; 
    } 
}
