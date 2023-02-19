public class Car {
    String color;
    String fuelType;
    int engineCapacity;
    public void  start(){
        System.out.println("Car started.");
    }
    public Car(String color, String fuelType, int engineCapacity){
        this.color = color;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;

    }
}
