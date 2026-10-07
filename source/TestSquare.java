public class TestSquare {
    public static void main(String[] args) {

        Square s = new Square(5.0);

        System.out.println("Awal          : " + s);
        System.out.println("Area awal     : " + s.getArea());      
        System.out.println("Perimeter awal: " + s.getPerimeter()); 
        System.out.println();

        s.setWidth(8.0);
        System.out.println("Sesudah setWidth(8)  : " + s);
        System.out.println("Area     : " + s.getArea());      
        System.out.println("Perimeter: " + s.getPerimeter());
        System.out.println();

        s.setLength(3.0);
        System.out.println("Sesudah setLength(3) : " + s);
        System.out.println("Area     : " + s.getArea());      
        System.out.println("Perimeter: " + s.getPerimeter()); 
        System.out.println();

        System.out.println("getArea() dan getPerimeter() tidak dioverride di Square.");
        System.out.println("Hasilnya tetap benar karena setter sudah menjaga width == length.");
    }
}