


import java.util.Map;
import java.util.Scanner;

/**

 */
public class App {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        //Horizontal Pyramid
        System.out.println("Horizontal Pyramid");
        System.out.print("Enter height: ");
        for(String element : HorizontalPyramid.buildPyramid(scanner.nextInt()))
        {
        System.out.println(element);
        }

        //JavaRegex
        System.out.println("Sum from a string");
        JavaRegex javaRegex = new JavaRegex();
        System.out.println(javaRegex.getSumFromString("a1.2bcde5ghergb9kljk10j"));

        //CountChars
        System.out.println("Character distribution");
        CountChars countChars = new CountChars();
        for(Map.Entry<Character, Integer> element : countChars.getDistribution("ssdf32123A..,.,scA1254~@#$%^&*ccA").entrySet())
        {
        System.out.println(element.getKey() + ":" + element.getValue());
        }
    }
}
