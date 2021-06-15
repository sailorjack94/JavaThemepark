import attractions.Attraction;
import behaviours.IReviewed;
import org.w3c.dom.Attr;
import people.Visitor;
import stalls.Stall;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewed;


    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls, ArrayList<IReviewed> reviewedItems) {
        this.attractions = attractions;
        this.stalls = stalls;
        this.reviewed = reviewedItems;
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
        ArrayList<IReviewed> reviewed = new ArrayList<>();
        reviewed.addAll(this.attractions);
        reviewed.addAll((Collection<? extends IReviewed>) this.stalls);
        return reviewed;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.visitAttraction();
        visitor.visitAttraction(attraction);
    }







}
