public class Square extends Shape {
       private double sidesIncms;
       
       public Square(double sidesIncms) {
              this.sidesIncms = sidesIncms;
       }

       @Override
       public double calculateArea() {
              return Math.pow(sidesIncms, sidesIncms);
       }
       
}
