import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember crewMember;

    Rank rank;

    @Before
    public void before(){
        crewMember = new CabinCrewMember("Lessleyy", rank.FLIGHTATTENDANT);
    }

    @Test
    public void cabinCrewCanTalk(){
        assertEquals("Beef or Chicken?", crewMember.talk());
    }
}
