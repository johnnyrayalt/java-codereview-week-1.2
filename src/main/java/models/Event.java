package models;

import java.util.HashMap;
import java.util.Map;

public class Event {

    private int guests;
    private String food;
    private String beverage;
    private String entertainment;
    private int bookingFee;
    private Map<String, Double> foodItemsAndPrices;
    private Map<String, Double> beverageItemsAndPrices;
    private Map<String, Double> entertainmentOptionsAndPrices;
    private Double price;


    public Event() {
        this.guests = 0;
        this.food = "none";
        this.beverage = "none";
        this.entertainment = "none";
        this.price = 0.00;
        this.bookingFee = 150;
        this.foodItemsAndPrices = new HashMap();
        foodItemsAndPrices.put("none", 0.00);
        foodItemsAndPrices.put("small", 50.00);
        foodItemsAndPrices.put("medium", 45.00);
        foodItemsAndPrices.put("large", 40.00);
        foodItemsAndPrices.put("xl", 35.00);
        this.beverageItemsAndPrices = new HashMap();
        beverageItemsAndPrices.put("none", 0.00);
        beverageItemsAndPrices.put("nonalcoholic", 300.00);
        beverageItemsAndPrices.put("small bar", 500.00);
        beverageItemsAndPrices.put("medium bar", 1000.00);
        beverageItemsAndPrices.put("large bar", 2000.00);
        beverageItemsAndPrices.put("xl bar", 4000.00);
        this.entertainmentOptionsAndPrices = new HashMap();
        entertainmentOptionsAndPrices.put("none", 0.00);
        entertainmentOptionsAndPrices.put("self provided", 0.00);
        entertainmentOptionsAndPrices.put("dj", 300.00);
        entertainmentOptionsAndPrices.put("kj", 200.00);
        entertainmentOptionsAndPrices.put("live band", 1200.00);
    }

    public int getGuests() {
        return this.guests;
    }

    public String getFood() {
        return this.food;
    }

    public String getBeverage() {
        return this.beverage;
    }

    public String getEntertainment() {
        return this.entertainment;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setGuests(int userInputNumberOfGuests) {
        this.guests = userInputNumberOfGuests;
    }

    public int setBookingFee(){
        return this.bookingFee;
    }

    public Map getFoodItemsAndPrices() {
        return this.foodItemsAndPrices;
    }

    public void setFoodSelection(String userInputFoodSelection) {
        this.food = userInputFoodSelection.toLowerCase();
    }

    public Map<String, Double> getBeverageItemsAndPrices() {
        return this.beverageItemsAndPrices;
    }

    public void setBeverageSelection(String userInputBeverageSelection) {
        this.beverage = userInputBeverageSelection.toLowerCase();
    }

    public Map<String, Double> getEntertainmentOprionsAndPrices() {
        return this.entertainmentOptionsAndPrices;
    }

    public void setEntertainmentSelection(String userInputEntertainmetSelection) {
        this.entertainment = userInputEntertainmetSelection.toLowerCase();
    }

    public Double setFinalPrice() {
        return (price += (guests * foodItemsAndPrices.get(food)) +
                beverageItemsAndPrices.get(beverage) +
                entertainmentOptionsAndPrices.get(entertainment) +
                bookingFee);
    }
}
