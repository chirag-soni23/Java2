public class ClassCar{
       static int noOfCarsold;

      int noOfWheels;
      String color;
      float currentFuelinLitre;
      int maxSpeed;
      int noOfseats;

      static{
       noOfCarsold = 0;
       System.out.println("I am in a static block");
      }
      {
       noOfCarsold++;
       System.out.println("I am in a init block");
      }

      ClassCar(String color){
       this.color = color;
       noOfWheels = 4;
      }
      ClassCar(){
       this("black");
      }


      public ClassCar start(){
       if(currentFuelinLitre < 0){
              System.out.println("Car is out of fuel, Cannot Start");
       }
       else if(currentFuelinLitre < 5){
              System.out.println("Car is in reserved mode, please refuel");
       }
       else{
              System.out.println("Car is started.....bruhhhh......");
       }
       return this;
      }

      public void drive(){
              System.out.println("Car is  driving");
              currentFuelinLitre--;
       

      }

      public float addFuel(float fuel){
       return currentFuelinLitre += fuel;
      }

      public float getCurrentfuelIncar(){
              return currentFuelinLitre;
      }
}


