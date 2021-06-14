import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewedAttractions;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls, ArrayList<IReviewed> reviewedItems) {
        this.attractions = attractions;
        this.stalls = stalls;
        this.reviewedAttractions = reviewedItems;
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }

    public ArrayList returnAttractions(){
        return this.attractions;
    }

    public ArrayList returnStalls(){
        return this.stalls;
    }

    public ArrayList<IReviewed> getReviewedItems() {
        return reviewedAttractions;
    }







}
