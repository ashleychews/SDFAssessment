package sdf.task01;

import java.util.LinkedList;
import java.util.List;

public class Google {

    private String app;
    private String category;
    //crete a linkedlist to store the ratings ->allow us to get the size
    private List<Double> ratings =  new LinkedList<>();
    private double highestRating;
    private double lowestRating;
    private String highestRapp;
    private String lowestRapp;


    public Google(String app, String category, double ratings) {
        this.app = app;
        this.category =category;
    }

    public String getApp() {
        return app;
    }

    //getters & setters for category
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Double> getRating() {
        return ratings;
    }

    public double getHighestRating() {
        return highestRating;
    }

    public double getLowestRating() {
        return lowestRating;
    }

    public String getHighestRapp() {
        return highestRapp;
    }

    public void setHighestRapp(String highestRapp) {
        this.highestRapp = highestRapp;
    }

    public String getLowestRapp() {
        return lowestRapp;
    }

    public void setLowestRapp(String lowestRapp) {
        this.lowestRapp = lowestRapp;
    }

    //function to add ratings into the linkedlist
    //public void addRatings(ratings){
    //  ratings.add();
    //}
    //

    //get average
    public double avrRating(List <Double> ratings) {
        int count = ratings.size(); //get the total count for that category
        int sum = 0;
        for (int i=0; i<count; i++) {
            sum +=1;
        }
        return sum/count;


    }

    
}
