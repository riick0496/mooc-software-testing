package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    GHappy happy;
    boolean result;
    public GHappyTest()
    {
        happy = new GHappy();
    }
    @Test
    public void WithoutGHappyOneG() {
        result = happy.gHappy("g");
        Assertions.assertFalse(result);
    }

    @Test
    public void OneGHappy()
    {
        result = happy.gHappy("gg");
        Assertions.assertTrue(result);
    }

    @Test
    public void WithoutGHappy()
    {
        result = happy.gHappy("x");
        Assertions.assertFalse(result);
    }

    @Test
    public void TwoGHappy()
    {
        result = happy.gHappy("xggxxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void TwoGHappyExtended()
    {
        result = happy.gHappy("xggxxgyxxgg");
        Assertions.assertFalse(result);
    }

    @Test
    public void MultipleGHappy()
    {
        result = happy.gHappy("gggggggg");
        Assertions.assertTrue(result);
    }

    @Test
    public void VoidGHappy()
    {
        result = happy.gHappy("");
        Assertions.assertFalse(result);
    }

    @Test
    public void MultipleLettersGHappy()
    {
        result = happy.gHappy("xyyggddfsgggxyhtrxikgggulouggoñpñixññiñoitggghbrggx");
        Assertions.assertTrue(result);
    }
}
