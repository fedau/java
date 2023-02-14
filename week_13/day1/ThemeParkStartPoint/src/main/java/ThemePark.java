import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;
    ArrayList<IReviewed> reviews;

    HashMap<String, Integer> reviewsHashMap;

    public ThemePark() {
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
        this.reviews = new ArrayList<IReviewed>();
        this.reviewsHashMap = new HashMap<>();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        reviews.addAll(attractions);
        reviews.addAll(stalls);
        return reviews;
    }

    public void addAttractionstoArray(Attraction attraction){
        attractions.add(attraction);
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.addOneToVisitCount();
        visitor.addAsVisited(attraction);
    }

    public HashMap<String, Integer> mapReviews(){
        ArrayList<IReviewed> allReviews = this.getAllReviewed();
        for (IReviewed review : allReviews){
            reviewsHashMap.put(review.getName(), review.getRating());
        }
        return reviewsHashMap;

    }


}

