
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by alarin on 03.08.2016.
 */
public class CharsDistr {

    public String CharsDistr(String chard){

        // test data
        String[] words  = chard.split("");

        Map dictionary = new HashMap();

        for (String word : words) {
            if (dictionary.containsKey(word)) {
                Integer val = (Integer) dictionary.get(word);
                dictionary.put(word, val + 1);
            } else
                dictionary.put(word, 1);
        }

        //System.out.print(dictionary.toString());
        String results = dictionary.toString();

        return results;
    }

    public String GetInput(){
        String inputLine = null;


        Scanner input = new Scanner( System.in );
        inputLine = input.next();

        //System.out.println("Received data: " + inputLine);

        return inputLine;
    }
}

