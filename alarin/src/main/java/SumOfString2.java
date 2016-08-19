/**
 * Created by alarin on 03.08.2016.
 */
public class SumOfString2 {
    public int TakeSum(String str) {
        int sum = 0;

        for (String node : str.split(";")) {
            //System.out.println(node);
            sum += Integer.parseInt(node);
        }

        //System.out.print(sum);

        return sum;
    }
}
