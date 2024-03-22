public class Testshape {
       public static void main(String[] args) {
              // Shape shape = new Shape();
              Circle circle = new Circle(5.4);
              Square square = new Square(10.7);

              System.out.printf("Area of circle is %5.2f\n",circle.calculateArea());
              System.out.printf("Area of square is %5.2f\n",square.calculateArea());
       }
       
}
