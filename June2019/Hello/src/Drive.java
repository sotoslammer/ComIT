public class Drive {
    public static void main(String[] args) {
        Car car = new Car("911", 1966, "Porsche", "Coupe", 140);
        car.accelerate(10);
        car.isStopped();
        car.stop();
    }
}
