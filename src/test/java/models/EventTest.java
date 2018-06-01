package models;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class EventTest {

//    GENERAL TESTS
    @Test
    public void newEvent_instantiatesCorrectly() throws Exception {
        Event testEvent = new Event();
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void newEvent_numberOfGuests_is0() {
        Event testEvent = new Event();
        assertEquals(0, testEvent.getGuests());
    }

    @Test
    public void newEvent_typeOfFood_isNone() {
        Event testEvent = new Event();
        assertEquals("none", testEvent.getFood());
    }

    @Test
    public void newEvent_typeOfBeverage_isNone() {
        Event testEvent = new Event();
        assertEquals("none", testEvent.getBeverage());
    }

    @Test
    public void newEvent_typeofEntertainment_isNone() {
        Event testEvent = new Event();
        assertEquals("none", testEvent.getEntertainment());
    }

//    @Test
//    public void newEvent_setGuests_is0() {
//        Event testEvent = new Event();
//        int userInputNumberOfGuests = 1;
//        assertEquals(1, testEvent.setGuests(userInputNumberOfGuests));
//    }

    @Test
    public void newEvent_setBookingFee_is150() {
        Event testEvent = new Event();
        assertEquals(150, testEvent.setBookingFee());
    }

//    GET FOOD PRICES AND OPTIONS TESTS
    @Test
    public void newEvent_getFoodPrices_setHashMap() {
        Event testEvent = new Event();
        Map<String, Double> getFoodOptions = new HashMap();
        getFoodOptions.put("none", 0.00);
        getFoodOptions.put("small", 50.00);
        getFoodOptions.put("medium", 45.00);
        getFoodOptions.put("large", 40.00);
        getFoodOptions.put("xl", 35.00);
        assertEquals(getFoodOptions, testEvent.getFoodItemsAndPrices());
    }

    @Test
    public void newEvent_setFoodOption_optionSmall() {
        Event testEvent = new Event();
        testEvent.setFoodSelection("small");
        String setFoodSelectionSmall = "small";
        assertEquals(setFoodSelectionSmall, testEvent.getFood());
    }

    @Test
    public void newEvent_setFoodOption_optionMedium() {
        Event testEvent = new Event();
        testEvent.setFoodSelection("medium");
        String setFoodSelectionMedium = "medium";
        assertEquals(setFoodSelectionMedium, testEvent.getFood());
    }

    @Test
    public void newEvent_setFoodOption_optionLarge() {
        Event testEvent = new Event();
        testEvent.setFoodSelection("large");
        String setFoodSelectionLarge = "large";
        assertEquals(setFoodSelectionLarge, testEvent.getFood());
    }

    @Test
    public void newEvent_setFoodOption_optionXL() {
        Event testEvent = new Event();
        testEvent.setFoodSelection("xl");
        String setFoodSelectionXl = "xl";
        assertEquals(setFoodSelectionXl, testEvent.getFood());
    }

//    GET BEVERAGE PRICES AND OPTIONS TESTS
    @Test
    public void newEvent_getBeveragePrices_setHashMap() {
        Event testEvent = new Event();
        Map<String, Double> getBeverageOptions = new HashMap();
        getBeverageOptions.put("none", 0.00);
        getBeverageOptions.put("nonalcoholic", 300.00);
        getBeverageOptions.put("small bar", 500.00);
        getBeverageOptions.put("medium bar", 1000.00);
        getBeverageOptions.put("large bar", 2000.00);
        getBeverageOptions.put("xl bar", 4000.00);
        assertEquals(getBeverageOptions, testEvent.getBeverageItemsAndPrices());
    }

    @Test
    public void newEvent_setBeverageOption_optionNonalcoholic() {
        Event testEvent = new Event();
        testEvent.setBeverageSelection("nonalcoholic");
        String setBeverageSelectionSmall = "nonalcoholic";
        assertEquals(setBeverageSelectionSmall, testEvent.getBeverage());
    }

    @Test
    public void newEvent_setBeverageOption_optionSmallBar() {
        Event testEvent = new Event();
        testEvent.setBeverageSelection("small bar");
        String setBeverageSelectionSmall = "small bar";
        assertEquals(setBeverageSelectionSmall, testEvent.getBeverage());
    }

    @Test
    public void newEvent_setBeverageOption_optionMediumBar() {
        Event testEvent = new Event();
        testEvent.setBeverageSelection("medium bar");
        String setBeverageSelectionMedium = "medium bar";
        assertEquals(setBeverageSelectionMedium, testEvent.getBeverage());
    }

    @Test
    public void newEvent_setBeverageOption_optionLargeBar() {
        Event testEvent = new Event();
        testEvent.setBeverageSelection("large bar");
        String setBeverageSelectionLarge= "large bar";
        assertEquals(setBeverageSelectionLarge, testEvent.getBeverage());
    }

    @Test
    public void newEvent_setBeverageOption_optionXLBar() {
        Event testEvent = new Event();
        testEvent.setBeverageSelection("xl bar");
        String setBeverageSelectionXl= "xl bar";
        assertEquals(setBeverageSelectionXl, testEvent.getBeverage());
    }


//    GET ENTERTAINMENT OPTIONS AND PRICES
    @Test
    public void newEvent_getEntertainmentPrices_setHashMap() {
        Event testEvent = new Event();
        Map<String, Double> getEntertainmentOptions = new HashMap();
        getEntertainmentOptions.put("none", 0.00);
        getEntertainmentOptions.put("self provided", 0.00);
        getEntertainmentOptions.put("dj", 300.00);
        getEntertainmentOptions.put("kj", 200.00);
        getEntertainmentOptions.put("live band", 1200.00);
        assertEquals(getEntertainmentOptions, testEvent.getEntertainmentOprionsAndPrices());
    }

    @Test
    public void newEvent_setEntertainmentOption_optionSelfProvided() {
        Event testEvent = new Event();
        testEvent.setEntertainmentSelection("self provided");
        String setEntertainmentSelectionSelfProvided = "self provided";
        assertEquals(setEntertainmentSelectionSelfProvided, testEvent.getEntertainment());
    }

    @Test
    public void newEvent_setEntertainmentOption_optionDJ() {
        Event testEvent = new Event();
        testEvent.setEntertainmentSelection("dj");
        String setEntertainmentSelectionDJ= "dj";
        assertEquals(setEntertainmentSelectionDJ, testEvent.getEntertainment());
    }

    @Test
    public void newEvent_setEntertainmentOption_optionKJ() {
        Event testEvent = new Event();
        testEvent.setEntertainmentSelection("kj");
        String setEntertainmentSelectionKJ= "kj";
        assertEquals(setEntertainmentSelectionKJ, testEvent.getEntertainment());
    }

    @Test
    public void newEvent_setEntertainmentOption_optionLiveBand() {
        Event testEvent = new Event();
        testEvent.setEntertainmentSelection("live band");
        String setEntertainmentSelectionLiveBand= "live band";
        assertEquals(setEntertainmentSelectionLiveBand, testEvent.getEntertainment());
    }

//    TOTAL PRICE TESTS
    @Test
    public void newEvent_SetPrices() {
        Event testEvent = new Event();
        testEvent.setGuests(10);
        testEvent.setFoodSelection("medium");
        testEvent.setBeverageSelection("large bar");
        testEvent.setEntertainmentSelection("dj");
        testEvent.setFinalPrice();
        Double expectedOutcome = 2900.00;
        assertEquals(expectedOutcome, testEvent.getPrice());
    }

}