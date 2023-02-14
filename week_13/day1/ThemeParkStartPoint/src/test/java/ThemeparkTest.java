import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class ThemeparkTest {

    ThemePark themePark;

    Visitor visitor;

    Attraction attractions;

    RollerCoaster rollercoaster;

    @Before
    public void before(){
//        themePark = new ThemePark();
        rollercoaster = new RollerCoaster("Tower", 4);
        visitor = new Visitor(45, 180, 40);
        themePark = new ThemePark();
    }

    @Test
    public void attractioncountGoesUp(){
        themePark.visit(visitor, rollercoaster);
        assertEquals(1,rollercoaster.getVisitCount() );

    }

    @Test
    public void visitedForVisitorGoesUp(){
        themePark.visit(visitor, rollercoaster);
        themePark.visit(visitor, rollercoaster);
        assertEquals(2, visitor.howManyVisited());
    }

    @Test
    public void getTheHashmap(){
        themePark.addAttractionstoArray(rollercoaster);
        themePark.getAllReviewed();
        Integer expectedRating = 4;
        assertEquals(expectedRating, themePark.mapReviews().get("Tower"));
    }
}
