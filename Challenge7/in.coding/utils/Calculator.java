public class Calculator {
       public static void main(String[] args) {
              Circle circle = new Circle(5.6);
              Rectangle rectangle = new Rectangle(10, 20);

              double cicleArea = Math.round(Math.PI * Math.pow(circle.radius, 2));
              double rectangleArea = rectangle.length * rectangle.breadth;

              System.out.printf("Area of circle is: %s. Area of rectangle is: %s",cicleArea,rectangleArea);
       }
       
}
