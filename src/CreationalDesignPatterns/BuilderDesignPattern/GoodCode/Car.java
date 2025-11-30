package CreationalDesignPatterns.BuilderDesignPattern.GoodCode;

public final class Car {
    private final String engine;
    private final int wheels;
    private final int seats;
    private final String color;
    private final boolean hasSunRoof;
    private final boolean hasNavigationSystem;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.seats = builder.seats;
        this.color = builder.color;
        this.hasSunRoof = builder.hasSunRoof;
        this.hasNavigationSystem = builder.hasNavigationSystem;
    }

    public static class CarBuilder {
        private String engine = "V8";
        private int wheels = 4;
        private int seats = 5;
        private String color = "Black";
        private boolean hasSunRoof = false;
        private boolean hasNavigationSystem = true;

        public CarBuilder engine(String engine) {
            if (engine == null || engine.isEmpty()) {
                throw new IllegalArgumentException("Engine cannot be null or empty");
            }
            this.engine = engine;
            return this;
        }

        public CarBuilder wheels(int wheels) {
            if (wheels <= 0) {
                throw new IllegalArgumentException("Wheels must be greater than 0");
            }
            this.wheels = wheels;
            return this;
        }

        public CarBuilder seats(int seats) {
            if (seats <= 0) {
                throw new IllegalArgumentException("Seats must be greater than 0");
            }
            this.seats = seats;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder hasSunRoof(boolean hasSunRoof) {
            this.hasSunRoof = hasSunRoof;
            return this;
        }

        public CarBuilder hasNavigationSystem(boolean hasNavigationSystem) {
            this.hasNavigationSystem = hasNavigationSystem;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public boolean hasSunRoof() {
        return hasSunRoof;
    }

    public boolean hasNavigationSystem() {
        return hasNavigationSystem;
    }
}
