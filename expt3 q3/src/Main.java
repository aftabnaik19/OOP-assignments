class Appliance {
    protected double powerRating;
    protected double usageHours;

    public Appliance(double powerRating, double usageHours) {
        this.powerRating = powerRating;
        this.usageHours = usageHours;
    }

    public double powerConsumption() {
        return powerRating * usageHours;
    }
}

class WashingMachine extends Appliance {
    public WashingMachine(double powerRating, double usageHours) {
        super(powerRating, usageHours);
    }

    public double powerConsumption(String cycle) {
        double baseConsumption = super.powerConsumption();
        switch (cycle.toLowerCase()) {
            case "heavy":
                return baseConsumption * 1.5;
            case "eco":
                return baseConsumption * 0.75;
            case "normal":
            default:
                return baseConsumption;
        }
    }

    public double powerConsumption(int numberOfClothes) {
        double baseConsumption = super.powerConsumption();
        return baseConsumption + numberOfClothes * 0.1;
    }

    public double powerConsumption(String cycle, String detergentType) {
        double baseConsumption = powerConsumption(cycle);
        if ("eco-friendly".equalsIgnoreCase(detergentType)) {
            return baseConsumption * 0.9;
        } else {
            return baseConsumption;
        }
    }

    public double powerConsumption(int numberOfClothes, String detergentType, String cycle) {
        double baseConsumption = powerConsumption(cycle);
        baseConsumption += numberOfClothes * 0.1;
        if ("eco-friendly".equalsIgnoreCase(detergentType)) {
            return baseConsumption * 0.9;
        } else {
            return baseConsumption;
        }
    }

    public static void main(String[] args) {
        Appliance appliance = new Appliance(500, 2);
        System.out.println("Appliance power consumption: " + appliance.powerConsumption() + " watt-hours");

        WashingMachine wm = new WashingMachine(500, 2);
        System.out.println("Washing machine power consumption (normal): " + wm.powerConsumption("normal") + " watt-hours");
        System.out.println("Washing machine power consumption (heavy): " + wm.powerConsumption("heavy") + " watt-hours");
        System.out.println("Washing machine power consumption (eco): " + wm.powerConsumption("eco") + " watt-hours");
        System.out.println("Washing machine power consumption (10 clothes): " + wm.powerConsumption(10) + " watt-hours");
        System.out.println("Washing machine power consumption (normal, eco-friendly detergent): " + wm.powerConsumption("normal", "eco-friendly") + " watt-hours");
        System.out.println("Washing machine power consumption (10 clothes, normal, eco-friendly detergent): " + wm.powerConsumption(10, "eco-friendly", "normal") + " watt-hours");
    }
}
