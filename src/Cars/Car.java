package Cars;

public class Car {
   private String brand;
    private String type;
    private boolean Electric;
    private  boolean DriverSide_Left;
    private boolean TransmissionType_Manual;
    private String Manufacture;
    private int YearOfMake;
    private String color;
    private int EngineSize;
    private double Weight;
    private int NumberOFSeats;
    private double Milage;

    private int Price;

    public Car(String brand, String type, boolean electric, boolean driverSide_Left, boolean transmissionType_Manual, String manufacture, int yearOfMake, String color, int engineSize, double weight, int numberOFSeats, double milage, int price) {
        this.brand = brand;
        this.type = type;
        Electric = electric;
        DriverSide_Left = driverSide_Left;
        TransmissionType_Manual = transmissionType_Manual;
        this.Manufacture = manufacture;
        YearOfMake = yearOfMake;
        this.color = color;
        this.EngineSize = engineSize;
        this.Weight = weight;
        this.NumberOFSeats = numberOFSeats;
        this.Milage = milage;

        this.Price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isElectric() {
        return Electric;
    }

    public void setElectric(boolean electric) {
        Electric = electric;
    }

    public boolean isDriverSide_Left() {
        return DriverSide_Left;
    }

    public void setDriverSide_Left(boolean driverSide_Left) {
        DriverSide_Left = driverSide_Left;
    }

    public boolean isTransmissionType_Manual() {
        return TransmissionType_Manual;
    }

    public void setTransmissionType_Manual(boolean transmissionType_Manual) {
        TransmissionType_Manual = transmissionType_Manual;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public void setManufacture(String manufacture) {
        Manufacture = manufacture;
    }

    public int getYearOfMake() {
        return YearOfMake;
    }

    public void setYearOfMake(int yearOfMake) {
        YearOfMake = yearOfMake;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEngineSize() {
        return EngineSize;
    }

    public void setEngineSize(int engineSize) {
        EngineSize = engineSize;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public int getNumberOFSeats() {
        return NumberOFSeats;
    }

    public void setNumberOFSeats(int numberOFSeats) {
        NumberOFSeats = numberOFSeats;
    }

    public double getMilage() {
        return Milage;
    }

    public void setMilage(double milage) {
        Milage = milage;
    }



    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

}
