class vehicle{
  void feature(){
       System.out.println("vehicle feature");
  }
}
 class Motorbike extends vehicle{
       void feature() {
          System.out.println("Motorbike has a Disk brake"); 
       }
    }
 class Car extends vehicle{
    void feature(){
        System.out.println("Car has Ac ");
    }
 }
 class Auto extends vehicle{
     void feature(){
        System.out.println("Auto has a meter");
     }
 }
  public class main {
    public static void main(String[] args)
    {
        Motorbike m = new Motorbike();
        Car c = new Car();
        Auto a = new Auto();

       m.feature();
       c.feature();
       a.feature();
    }
   }