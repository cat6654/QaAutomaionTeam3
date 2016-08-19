import org.junit.Test;

/**
 * Created by alarin on 18.08.2016.
 */
public class CharsDistributionTest {

    @Test
    public void charsCalculationCheck(){

        // Show results of distribution
        CharsDistr CharsCalc = new CharsDistr();

       // String inputLine = CharsCalc.GetInput();
        String result = CharsCalc.CharsDistr("aaaabbbbcccc");

        System.out.println(result);
    }
}
