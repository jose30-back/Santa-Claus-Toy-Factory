package dev.personal.java.santa.claus.factory.models;

public class GoodToy extends Toy {

    String brand;
    int targetAge;
    String category;

    public GoodToy(String title, boolean isGoodToy, String brand, int targetAge, String category) {
        super(title, isGoodToy);
        this.brand = brand;
        this.targetAge = targetAge;
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public int getTargetAge() {
        return targetAge;
    }

    public String getCategory() {
        return category;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTargetAge(int targetAge) {
        this.targetAge = targetAge;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    

}
