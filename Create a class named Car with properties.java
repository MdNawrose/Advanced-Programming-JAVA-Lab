import java.util.ArrayList;
class Car {
private double price;
    private String brand;
    private double speed;
  public Car(double price, String brand, double speed) {
        this.price = price;
        this.brand = brand;
        this.speed = speed;
    } public double getPrice() {
        return price;
        public String getBrand() {
        return brand;
    } public double getSpeed() {
        return speed;
    }    public String toString() {
        return "Car [Brand=" + brand + ", Price=" + price + " Taka, Speed=" + speed + " km/h]";
    } public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car(1500000, "Toyota", 180));
        cars.add(new Car(2500000, "BMW", 240));
        cars.add(new Car(3000000, "Mercedes", 220));
        cars.add(new Car(1800000, "Honda", 160));
        cars.add(new Car(3500000, "Audi", 250));

        System.out.println("Cars with price over 2,000,000 takas:");
        for (Car car : cars) {
            if (car.getPrice() > 2000000) {
                System.out.println(car);
            } 
         }
     }
}
