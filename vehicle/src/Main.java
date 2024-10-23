class Vehicle {
    protected double distance;
    protected double fuelUsed;

    public Vehicle(double distance, double fuelUsed) {
        this.distance = distance;
        this.fuelUsed = fuelUsed;
    }

    public double fuelEfficiency() {
        if (fuelUsed == 0) {
            return 0;
        }
        return distance / fuelUsed;
    }
}

class Car extends Vehicle {
    private String fuelType;

    public Car(double distance, double fuelUsed, String fuelType) {
        super(distance, fuelUsed);
        this.fuelType = fuelType;
    }

    public double fuelEfficiency(double distance, double fuelUsed, String fuelType) {
        if (fuelUsed == 0) {
            return 0;
        }
        double baseEfficiency = distance / fuelUsed;
        if ("diesel".equalsIgnoreCase(fuelType)) {
            return baseEfficiency * 0.9;
        } else if ("gasoline".equalsIgnoreCase(fuelType)) {
            return baseEfficiency;
        } else {
            return baseEfficiency;
        }
    }

    @Override
    public double fuelEfficiency() {
        return fuelEfficiency(this.distance, this.fuelUsed, this.fuelType);
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(500, 25);
        System.out.println("Vehicle fuel efficiency: " + vehicle.fuelEfficiency() + " km/l");

        Car dieselCar = new Car(500, 25, "diesel");
        System.out.println("Diesel car fuel efficiency: " + dieselCar.fuelEfficiency() + " km/l");

        Car gasolineCar = new Car(500, 25, "gasoline");
        System.out.println("Gasoline car fuel efficiency: " + gasolineCar.fuelEfficiency() + " km/l");

        Car customCar = new Car(0, 0, "unknown");
        System.out.println("Custom car fuel efficiency with custom inputs: " + customCar.fuelEfficiency(600, 30, "diesel") + " km/l");
    }
}
