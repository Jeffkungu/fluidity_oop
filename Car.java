public class Car {

    private int cargoSpace = 0;

    // Removed default vehicle type since it's instantianted in the constructor.
    private int vehicleType;

    // Have the vehicle type as constants to make the code more maintainable
    public static final int CAR = 0;
    public static final int ELECTRIC_CAR = 1;
    public static final int TRUCK = 2;

    public Car(int vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void drive() {
        // Open for implementation
        // Different vehicle classes can override the method to add logic for driving
        // the specific vehicle ie car or truck.
    }

    public void addCargo(int kgs) {
        int weightLimit = getWeightLimit();
        int newWeight = this.cargoSpace + kgs;

        if (newWeight > weightLimit) {
            throw new IllegalArgumentException("Too Heavy");
        }

        this.cargoSpace = newWeight;
    }

    /**
     * Helper method to handle the cargo weight limits for different
     * vehicle classes implementing the Car class.
     *
     * @return int return vehilcle weight limit
     */
    public int getWeightLimit() {
        if (vehicleType == CAR || vehicleType == ELECTRIC_CAR) {
            return 500;
        } else if (vehicleType == TRUCK) {
            return 18000;
        } else {
            throw new IllegalStateException("Invalid vehicle type.");
        }
    }

    public void fillUpPetrol() {
        // Open for implementation
        // Different vehicle classes can override the method to add logic for fueling
        // the specific vehicle ie car or truck.
    }

    public void changeOil() {
        // Open for implementation
        // Different vehicle classes can override the method to add logic for changing
        // oil for the specific vehicle ie car or truck.
    }

    public void printStats() {
        // Open for implementation
        // Different vehicle classes can override the method to add logic for checking
        // vehicle status of the specific vehicle ie car or truck.
    }


    /**
     * Getter method for cargoSpace state.
     *
     * @return int return the cargoSpace
     */
    public int getCargoSpace() {
        return cargoSpace;
    }

    /**
     * Setter method for cargoSpace state.
     *
     * @param cargoSpace the cargoSpace to set
     */
    public void setCargoSpace(int cargoSpace) {
        this.cargoSpace = cargoSpace;
    }

    /**
     * Getter method for vehicleType state.
     *
     * @return int return the vehicleType
     */
    public int getVehicleType() {
        return vehicleType;
    }

    /**
     * Setter method for vehicleType state.
     *
     * @param vehicleType the vehicleType to set
     */
    public void setVehicleType(int vehicleType) {
        this.vehicleType = vehicleType;
    }

}
