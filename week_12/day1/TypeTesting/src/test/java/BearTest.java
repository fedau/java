import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest {
    private Bear bear;

    @Before
    public void setop(){
        bear = new Bear("Harold", 34, 80.43, 'f');
    }

    @Test
    public void bearHasAName(){
        assertEquals("Harold", bear.getName());
    }

    @Test
    public void bearSetNewName(){
        assertEquals("Lesly", bear.setName("Lesly"));
    }

    @Test
    public void bearHasAge(){
        assertEquals(34, bear.getAge());
    }
    @Test
    public void bearHasWeight(){
        Bear bear = new Bear("Rolo", 34, 55.5, 'f');
        assertEquals(55.5, bear.getWeight(), 0.0);

    }
    @Test
    public void bearIsReadyToHibernateIfWeightGreaterThen80(){
        assertEquals(true, bear.readyToHibernate());

    }
    @Test
    public void bearNotReadyToHibernateIfWeightNOTGreaterThen80(){
        Bear lightbear = new Bear("Rolo", 34, 55.5, 'm');
        assertEquals(false, lightbear.readyToHibernate());

    }

    @Test
    public void bearHasASex(){
        assertEquals('f', bear.getSex());
    }
}
