public class Circle extends Shape {
       private double radiusIncms;
       
       public Circle(double radiusIncms) {
              this.radiusIncms = radiusIncms;
       }

       @Override
       public double calculateArea() {
              return Math.PI * Math.pow(radiusIncms,2);
       } 
       
}
